/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Music;
import model.PlayList;

/**
 *
 * @author hiepx
 */
public class PlayListDAO extends BaseDAO<PlayList> {

    @Override
    public ArrayList getAll() {
        ArrayList<PlayList> playlists = new ArrayList<>();
        try {
            String sql = "SELECT TOP 1000 [playlistId]\n"
                    + "      ,[name]\n"
                    + "      ,[musicId]\n"
                    + "  FROM [musicDb].[dbo].[playList]";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                PlayList p = new PlayList();
                p.setId(rs.getInt("playListId"));
                p.setName(rs.getString("name"));
                p.setAccountId(rs.getInt("musicId"));
                playlists.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PlayListDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return playlists;
    }

    public ArrayList getMusicOfPlaylist() {
        ArrayList<Music> playlists = new ArrayList<>();
        try {
            String sql = "select m.musicId, m.name, m.[path], m.singer\n"
                    + "from List l join Playlist p\n"
                    + "on l.playlistId = p.playlistId join Music m on m.musicID = l.musicID";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Music p = new Music();
                p.setId(rs.getInt("musicId"));
                p.setName(rs.getString("name"));
                p.setPath(rs.getString("path"));
                p.setSinger(rs.getString("singer"));
                playlists.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PlayListDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return playlists;
    }

}
