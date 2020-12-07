package com.peterchivers.musicstore.bootstrap;

import com.peterchivers.musicstore.entities.*;
import com.peterchivers.musicstore.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AlbumRepository albumRepository;
    private final ArtistRepository artistRepository;
    private final BandRepository bandRepository;
    private final GenreRepository genreRepository;
    private final SongRepository songRepository;

    public BootstrapData(AlbumRepository albumRepository, ArtistRepository artistRepository,
                         BandRepository bandRepository, GenreRepository genreRepository, SongRepository songRepository) {
        this.albumRepository = albumRepository;
        this.artistRepository = artistRepository;
        this.bandRepository = bandRepository;
        this.genreRepository = genreRepository;
        this.songRepository = songRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started Data Boostrap");
        Genre genreRock = new Genre("Rock");
        genreRepository.save(genreRock);

        Genre genreDance = new Genre("Dance");
        genreRepository.save(genreDance);

        Artist artist1 = new Artist("Eddie", "Vedder", LocalDate.of(1964, 12, 23));
        artistRepository.save(artist1);

        Band band1 = new Band("Pearl Jam");
        band1.getArtists().add(artist1);
        artist1.getBands().add(band1);
        bandRepository.save(band1);
        artistRepository.save(artist1);

        Album album1 = new Album("Yield", LocalDate.of(1998, 2, 3), band1);
        albumRepository.save(album1);

        band1.getAlbums().add(album1);
        album1.getGenres().add(genreRock);
        bandRepository.save(band1);

        Song song1 = new Song("Brain of J.", 179, album1);
        album1.getSongs().add(song1);
        songRepository.save(song1);
        albumRepository.save(album1);


        System.out.println("Data Bootstrap Ended");
    }
}
