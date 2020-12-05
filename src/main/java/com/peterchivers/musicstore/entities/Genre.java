package com.peterchivers.musicstore.entities;


import java.util.Set;

public class Genre extends BaseEntity {

    private String name;
    private Set<Album> albums;

    public Genre(Long id, String name, Set<Album> albums) {
        super(id);
        this.name = name;
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }
}
