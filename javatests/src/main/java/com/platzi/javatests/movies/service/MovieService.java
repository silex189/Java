package com.platzi.javatests.movies.service;

import com.platzi.javatests.movies.data.MovieRepository;
import com.platzi.javatests.movies.model.Genre;
import com.platzi.javatests.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByLength(Integer length) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() <= length).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByName(String name){
        String NAME = name.toLowerCase();
        return movieRepository.findAll().stream().filter(movie -> movie.getName().toLowerCase().contains(NAME)).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByDirector(String director) {
        String DIRECTOR = director.toLowerCase();
        return movieRepository.findAll().stream().filter(movie -> movie.getDirector().toLowerCase().contains(DIRECTOR)).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByTemplate(Movie template) {

        Collection<Movie> movies = movieRepository.findAll();

        if ( template.getId() == null) {
            movies = templateFilter(template, movies);
        } else {
            movies = movies.stream().filter(movie -> movie.getId() == template.getId()).collect(Collectors.toList());
        }

        return movies;
    }

    private Collection<Movie> templateFilter(Movie template, Collection<Movie> movies) {
        if ( template.getName() != null) {
            movies = movies.stream().filter(movie -> movie.getName().toLowerCase().contains(template.getName().toLowerCase())).collect(Collectors.toList());
        }

        if (template.getDirector() != null) {
            movies = movies.stream().filter(movie -> movie.getDirector().toLowerCase().contains(template.getDirector().toLowerCase())).collect(Collectors.toList());
        }

        if (template.getMinutes() != null) {
            movies = movies.stream().filter(movie -> movie.getMinutes() <= template.getMinutes()).collect(Collectors.toList());
        }

        if (template.getGenre() != null) {
            movies = movies.stream().filter(movie -> movie.getGenre() == template.getGenre()).collect(Collectors.toList());
        }
        return movies;
    }

}
