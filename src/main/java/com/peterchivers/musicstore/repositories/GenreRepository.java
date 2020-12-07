package com.peterchivers.musicstore.repositories;

import com.peterchivers.musicstore.entities.Genre;
import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Long> {
}
