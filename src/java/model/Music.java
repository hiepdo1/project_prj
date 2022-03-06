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
public class Music {
    private int id;
    private String name;
    private String singer;
    private String path;

    public Music() {
    }

    public Music(int id, String name, String singer, String path) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.path = path;
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "music{" + "id=" + id + ", name=" + name + ", singer=" + singer + ", path=" + path + '}';
    }
    
    
}
