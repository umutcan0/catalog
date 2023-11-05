package com.example.catalog.services;

import com.example.catalog.entities.Movie;
import com.example.catalog.repositories.MovieRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovie() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovie(Long id){
        return movieRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Film bulunamadı"));
    }

    @Override
    public Movie createMovie(Movie movie){
        return movieRepository.save(movie);
    }

    @Override
    public Movie updateMovie(Long id, Movie movie){
        Movie existingMovie = movieRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Movie bulunamadı"));

        existingMovie.setName(movie.getName());
        existingMovie.setActor(movie.getActor());

        return movieRepository.save(existingMovie);
    }

    @Override
    public void deleteMovie(Long id){
        movieRepository.deleteById(id);
    }
}

