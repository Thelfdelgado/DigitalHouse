package com.example.movieservice.service;

import com.example.movieservice.entity.MovieEntity;
import com.example.movieservice.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private IMovieRepository repository;

    public List<MovieEntity> findAll(){
        return repository.findAll();
    }

    public MovieEntity findById(Integer id){
        return repository.findById(id).get();
    }

    public MovieEntity save(MovieEntity movie){
        return repository.save(movie);
    }

    public List<MovieEntity> findByGenre(String genre){
        return repository.findByGenre(genre);
    }
}
