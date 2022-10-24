package com.tunner.api.repositories;

import com.tunner.api.entities.Genre;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends BaseRepository<Genre,Long>{
}
