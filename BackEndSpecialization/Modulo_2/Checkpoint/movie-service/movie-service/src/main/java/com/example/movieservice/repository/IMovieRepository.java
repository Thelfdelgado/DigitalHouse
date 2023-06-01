package com.example.movieservice.repository;

import com.example.movieservice.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMovieRepository extends JpaRepository<MovieEntity, Integer> {
    List<MovieEntity> findByGenre(String genre);
}
