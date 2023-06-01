package com.example.catalogservice.service;

import com.example.catalogservice.entity.GenreEntity;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "MOVIE-SERVICE")
@LoadBalancerClient(name = "MOVIE-SERVICE")
public interface IGenreService {
    @GetMapping("/movies/movie")
    List<GenreEntity> getMovies();

    @GetMapping("/movies/movie/{genre}")
    List<GenreEntity> getGenres(@PathVariable String genre);

    @GetMapping("/movies/movie/{id}")
    GenreEntity getGenre(@RequestParam Integer id);
}
