package com.peterchivers.musicstore.entities;

import java.util.Set;

public class Band extends BaseEntity {

    private String name;
    private Set<Artist> artists;
    private Set<Album> albums;

    public Band(Long id, String name, Set<Artist> artists, Set<Album> albums) {
        super(id);
        this.name = name;
        this.artists = artists;
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }
}
