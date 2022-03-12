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
import model.Music;

/**
 *
 * @author hiepx
 */
public class AccountDAO extends BaseDAO<Account> {

    @Override
    public ArrayList<Account> getAll() {
        ArrayList<Account> accounts = new ArrayList<>();
        try {
            String sql = "SELECT TOP 1000 [accountId]\n"
                    + "      ,[name]\n"
                    + "      ,[username]\n"
                    + "      ,[password]\n"
                    + "      ,[playlistId]\n"
                    + "  FROM [musicDb].[dbo].[account]";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setId(rs.getInt("accountId"));
                a.setName(rs.getString("name"));
                a.setUsername(rs.getString("username"));
                a.setPassword(rs.getString("password"));
                accounts.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accounts;
    }

    public Account getAccount(String username) {
        try {
            String sql = "SELECT [accountId]\n"
                    + "      ,[username]\n"
                    + "      ,[password]\n"
                    + "      ,[name]\n"
                    + "  FROM [musicDb].[dbo].[Account]"
                    + "where username = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Account s = new Account();
                s.setId(rs.getInt("accountId"));
                s.setName(rs.getString("name"));
                s.setUsername(rs.getString("username"));
                s.setPassword(rs.getString("password"));
                return s;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
