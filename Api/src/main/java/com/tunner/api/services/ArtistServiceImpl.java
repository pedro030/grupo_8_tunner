package com.tunner.api.services;

import com.tunner.api.entities.Artist;
import com.tunner.api.repositories.ArtistRepository;
import com.tunner.api.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl extends BaseServiceImpl<Artist, Long> implements ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    public ArtistServiceImpl(BaseRepository<Artist,Long> baseRepository){super(baseRepository);}

    @Override
    public List<Artist> search(String filter) throws Exception {
        try {
            List<Artist> artist = artistRepository.search(filter);
            return artist;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
