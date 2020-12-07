package com.peterchivers.musicstore.repositories;

import com.peterchivers.musicstore.entities.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {
}
