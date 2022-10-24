package com.tunner.api.controllers;

import com.tunner.api.entities.Genre;
import com.tunner.api.services.GenreServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "tunner/api/genres")
public class GenreController extends BaseControllerImpl<Genre, GenreServiceImpl> {
}
