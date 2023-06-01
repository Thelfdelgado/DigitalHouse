package com.example.catalogservice.controller;

import com.example.catalogservice.entity.GenreEntity;
import com.example.catalogservice.service.IGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/genres")
@CrossOrigin(origins = "*")
public class GenreController {
    private Logger log = Logger.getLogger(GenreController.class.getName());

    @Autowired
    private IGenreService service;

    @GetMapping("/genre")
    public ResponseEntity<List<GenreEntity>> getGenres(){
        log.info("getGenres");
        return ResponseEntity.ok(service.getMovies());
    }

    @GetMapping("/genre/{genre}")
    public ResponseEntity<List<GenreEntity>> getGenre(@PathVariable String genre){
        log.info("getGenre: " + genre);
        return ResponseEntity.ok(service.getGenres(genre));
    }

    @GetMapping("/genre/{id}")
    public ResponseEntity<GenreEntity> getGenre(Integer id){
        log.info("getGenre: " + id);
        return ResponseEntity.ok(service.getGenre(id));
    }
}
