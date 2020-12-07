package com.peterchivers.musicstore.repositories;

import com.peterchivers.musicstore.entities.Band;
import org.springframework.data.repository.CrudRepository;

public interface BandRepository extends CrudRepository<Band, Long> {
}
