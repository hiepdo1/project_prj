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
public class PlayList {
    private int id;
    private String name;
    private int accountId;

    public PlayList() {
    }

    public PlayList(int id, String name, int accountId) {
        this.id = id;
        this.name = name;
        this.accountId = accountId;
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

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "PlayList{" + "id=" + id + ", name=" + name + ", accountId=" + accountId + '}';
    }

    
    
    
}
