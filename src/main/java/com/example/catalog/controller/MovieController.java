package com.example.catalog.controller;

import com.example.catalog.entities.Movie;
import com.example.catalog.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Movie>> getAllMovie() {
        List<Movie> movies = movieService.getAllMovie();
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id) {
        Movie movie = movieService.getMovie(id);
        return ResponseEntity.ok(movie);
    }

    @PostMapping("/create")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
        Movie createdMovie = movieService.createMovie(movie);
        return ResponseEntity.ok(createdMovie);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable Long id,@RequestBody Movie movie){
        Movie updatedMovie = movieService.updateMovie(id,movie);
        return ResponseEntity.ok(updatedMovie);
    }

    @DeleteMapping("{id}")
    public void deleteMovie(@PathVariable Long id){
        movieService.deleteMovie(id);
    }
}

