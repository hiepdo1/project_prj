/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author hiepx
 */
import DAL.AccountDAO;
import DAL.MusicDAO;
import DAL.PlayListDAO;
import java.util.ArrayList;
public class tec {
     public static void main(String[] args) {
        // TODO code application logic here
        
        AccountDAO m = new AccountDAO();
        
       
         System.out.println(m.getAll());
    }
}

