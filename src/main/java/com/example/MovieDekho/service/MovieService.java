package com.example.MovieDekho.service;

import com.example.MovieDekho.entity.Movie;
import com.example.MovieDekho.service.intface.MovieServiceInterface;

import java.time.LocalDate;
import java.util.List;

public class MovieService implements MovieServiceInterface {
    @Override
    public Movie addMovie(Movie movie) {
        return null;
    }

    @Override
    public Movie getMovieById(Long id) {
        return null;
    }

    @Override
    public List<Movie> getAllMovies() {
        return List.of();
    }

    @Override
    public List<Movie> getMovieByGenre(String genre) {
        return List.of();
    }

    @Override
    public List<Movie> getMovieByTitle(String title) {
        return List.of();
    }

    @Override
    public List<Movie> getMovieByreleaseDate(LocalDate releaseDate) {
        return List.of();
    }
}
