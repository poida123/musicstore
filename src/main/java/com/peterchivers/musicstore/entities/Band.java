package com.peterchivers.musicstore.entities;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Band {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    private String name;

    @ManyToMany(mappedBy = "bands")
    private Set<Artist> artists;

    @OneToMany
    @JoinColumn(name = "album_id")
    private Set<Album> albums;

    public Band() {
    }

    public Band(Long id, String name, Set<Artist> artists) {
        this.id = id;
        this.name = name;
        this.artists = artists;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Band{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", artists=" + artists +
                ", albums=" + albums +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Band band = (Band) o;
        return Objects.equals(id, band.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
