package com.tunner.api.services;

import com.tunner.api.entities.Genre;
import com.tunner.api.repositories.BaseRepository;
import com.tunner.api.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GenreServiceImpl extends BaseServiceImpl<Genre,Long> implements GenreService {
    @Autowired
    GenreRepository genreRepository;

    public GenreServiceImpl(BaseRepository<Genre, Long> baseRepository) {super(baseRepository);}
}
