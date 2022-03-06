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
import model.Account;
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
                p.setMusicId(rs.getInt("musicId"));
                playlists.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return playlists;
    }

}
