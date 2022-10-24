package com.tunner.api.controllers;

import com.tunner.api.entities.Artist;
import com.tunner.api.services.ArtistServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "tunner/api/artists")
public class ArtistController extends BaseControllerImpl<Artist, ArtistServiceImpl>{
    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filter){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.search(filter));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"no results\"}");
        }
    }
}
