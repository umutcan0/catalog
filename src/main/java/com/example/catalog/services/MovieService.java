package com.example.catalog.services;

import com.example.catalog.entities.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    public List<Movie> getAllMovie();
    public Movie getMovie(Long id);
    public Movie createMovie(Movie movie);
    public Movie updateMovie(Long id, Movie movie);
    public void deleteMovie(Long id);
}
