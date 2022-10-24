package com.tunner.api.services;

import com.tunner.api.entities.Artist;

import java.util.List;

public interface ArtistService extends BaseService<Artist,Long>{
    List<Artist> search(String filter) throws Exception;
}
