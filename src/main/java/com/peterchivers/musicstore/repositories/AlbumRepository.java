package com.peterchivers.musicstore.repositories;

import com.peterchivers.musicstore.entities.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long> {
}
