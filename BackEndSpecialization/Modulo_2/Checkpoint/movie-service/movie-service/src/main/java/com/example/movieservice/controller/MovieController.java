package com.example.movieservice.controller;

import com.example.movieservice.entity.MovieEntity;
import com.example.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("movies")
@CrossOrigin(origins = "*")
public class MovieController {
    private Logger log = Logger.getLogger(MovieController.class.getName());

    @Autowired
    private MovieService service;

    @GetMapping("/movie")
    public ResponseEntity<List<MovieEntity>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/movie/{genre}")
    public ResponseEntity<List<MovieEntity>> findByGenre(@PathVariable String genre){
        List<MovieEntity> genreList = service.findByGenre(genre);
        if (genreList.isEmpty()){
            log.info("O genero " + genre + " não foi encontrado.");
            return new ResponseEntity<>(genreList, HttpStatus.NOT_FOUND);
        }
        log.info("findByGenre: " + genre);
        return new ResponseEntity<>(genreList, HttpStatus.OK);
    }

    @GetMapping("/movie/{id}")
    public ResponseEntity<MovieEntity> findById(Integer id){
        log.info("findById: " + id);
        MovieEntity movie = service.findById(id);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }
}
