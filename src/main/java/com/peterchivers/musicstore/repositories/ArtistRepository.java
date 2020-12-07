package com.peterchivers.musicstore.repositories;

import com.peterchivers.musicstore.entities.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
