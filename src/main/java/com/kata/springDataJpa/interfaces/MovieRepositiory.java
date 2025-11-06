package com.kata.springDataJpa.interfaces;

import com.kata.springDataJpa.enums.Genres;
import com.kata.springDataJpa.modules.Movie;

import java.util.List;

public interface JpaRepositiory {

    // busqueda por id
    List<Movie> findById(Integer id);
    // busqueda por titulo
    List<Movie> findByTitle(String title);
    // busqueda por título o género
    List<Movie> findBysdfOrGenre(String title,Genres genre);
    // busqueda por t
    List<Movie> findByYear(Integer year);
    List<Movie> findByRate(Float rate);
    List<Movie> findBySinopsis(String sinopsis);

}
