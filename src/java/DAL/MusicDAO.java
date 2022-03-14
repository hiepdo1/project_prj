package DAL;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Music;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hiepx
 */
public class MusicDAO extends BaseDAO<Music> {

    @Override
    public ArrayList<Music> getAll() {
        ArrayList<Music> Musics = new ArrayList<>();
        try {
            String sql = "SELECT [musicId]\n"
                    + "      ,[name]\n"
                    + "      ,[singer]\n"
                    + "      ,[path]\n"
                    + "  FROM [musicDb].[dbo].[music]";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Music m = new Music();
                m.setId(rs.getInt("musicId"));
                m.setName(rs.getString("name"));
                m.setSinger(rs.getString("singer"));
                m.setPath(rs.getString("path"));
                Musics.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MusicDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Musics;
    }

    public Music getMusic(int id) {
        try {
            String sql = "SELECT m.*\n"
                    + "from Music m where m.musicID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Music s = new Music();
                s.setId(rs.getInt("musicID"));
                s.setName(rs.getString("name"));
                s.setPath(rs.getString("path"));
                s.setSinger(rs.getString("singer"));
                return s;
            }

        } catch (SQLException ex) {
            Logger.getLogger(MusicDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Music> getListMusic(int id) {
        ArrayList<Music> Musics = new ArrayList<>();
        try {
            String sql = "select m.*\n"
                    + "from Music m join ListDetail l on m.musicID=l.musicID\n"
                    + "join Playlist p on l.playlistID = p.playlistID  where l.playlistID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Music s = new Music();
                s.setId(rs.getInt("musicID"));
                s.setName(rs.getString("name"));
                s.setPath(rs.getString("path"));
                s.setSinger(rs.getString("singer"));
                Musics.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MusicDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Musics;
    }

    public void updateMusic(Music s) {
        try {
            String sql = "update Music\n"
                    + "set \n"
                    + "name= ?,\n"
                    + "path = ?,\n"
                    + "singer = ?\n"
                    + "where musicID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, s.getName());
            statement.setString(2, s.getPath());
            statement.setString(3, s.getSinger());
            statement.setInt(4, s.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MusicDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteMusic(int id) {
        try {
            String sql = "DELETE ListDetail WHERE musicID=?\n"
                    + "DELETE Music WHERE musicID=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MusicDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertMusic(Music s) {
        try {
            String sql = "INSERT INTO Music\n"
                    + "           ([name]\n"
                    + "           ,[path]\n"
                    + "           ,[singer])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, s.getName());
            statement.setString(2, s.getPath());
            statement.setString(3, s.getSinger());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MusicDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
