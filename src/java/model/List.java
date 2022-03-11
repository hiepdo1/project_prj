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
public class List {
    private int playlistId;
    private int musicId;

    public List() {
    }

    public List(int playlistId, int musicId) {
        this.playlistId = playlistId;
        this.musicId = musicId;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }

    @Override
    public String toString() {
        return "List{" + "playlistId=" + playlistId + ", musicId=" + musicId + '}';
    }
    
    
}
