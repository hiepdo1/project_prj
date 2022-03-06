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
    private int musicId;

    public PlayList() {
    }

    public PlayList(int id, String name, int musicId) {
        this.id = id;
        this.name = name;
        this.musicId = musicId;
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

    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }

    @Override
    public String toString() {
        return "playList{" + "id=" + id + ", name=" + name + ", musicId=" + musicId + '}';
    }
    
    
}
