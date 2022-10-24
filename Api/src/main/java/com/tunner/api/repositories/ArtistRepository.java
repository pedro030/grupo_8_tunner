package com.tunner.api.repositories;

import com.tunner.api.entities.Artist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends BaseRepository<Artist,Long>{
    List<Artist> findByNameContaining(String name);

    @Query(value = "SELECT a from Artist a WHERE a.name LIKE %:filter%")
    List<Artist> search(@Param("filter") String filter);

    @Query(
            value = "SELECT * from Artists WHERE Artists.name LIKE %:filter%",
            nativeQuery = true
    )
    List<Artist> searchNative(@Param("filter") String filter);
}
