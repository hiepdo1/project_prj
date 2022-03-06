package DAL;

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

}
