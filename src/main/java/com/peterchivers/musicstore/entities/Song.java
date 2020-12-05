package com.peterchivers.musicstore.entities;

public class Song extends BaseEntity {

    private String name;
    private Integer length;
    private Album album;

    public Song(Long id, String name, Integer length, Album album) {
        super(id);
        this.name = name;
        this.length = length;
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
