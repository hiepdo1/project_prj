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
public class Account {
    private int id;
    private String name;
    private String username;
    private String password;
    private String playlisId;

    public Account() {
    }

    public Account(int id, String name, String username, String password, String playlisId) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.playlisId = playlisId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPlaylisId() {
        return playlisId;
    }

    public void setPlaylisId(String playlisId) {
        this.playlisId = playlisId;
    }

    @Override
    public String toString() {
        return "account{" + "id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", playlisId=" + playlisId + '}';
    }
    
    
}
