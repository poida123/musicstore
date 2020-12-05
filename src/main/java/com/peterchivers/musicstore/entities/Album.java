package com.peterchivers.musicstore.entities;

import java.time.LocalDate;
import java.util.Set;

public class Album extends BaseEntity {

    private String name;
    private LocalDate releaseDate;
    private Set<Song> songs;
    private Set<Genre> genre;
    private Band band;

    public Album(Long id, String name, LocalDate releaseDate, Band band, Set<Song> songs, Set<Genre> genre) {
        super(id);
        this.name = name;
        this.releaseDate = releaseDate;
        this.songs = songs;
        this.genre = genre;
        this.band = band;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    public Set<Genre> getGenre() {
        return genre;
    }

    public void setGenre(Set<Genre> genre) {
        this.genre = genre;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
}
