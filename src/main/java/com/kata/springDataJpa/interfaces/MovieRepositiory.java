package com.kata.springDataJpa.interfaces;

import com.kata.springDataJpa.enums.Genres;
import com.kata.springDataJpa.modules.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepositiory extends JpaRepository<Movie, Integer> {

    List<Movie> findByTitle(String title);

    List<Movie> findByTitleOrGenre(String title,Genres genre);

    List<Movie> findByTitleAndYear(String title,Integer year);

    List<Movie> findByRateGreaterThan(Integer rate);

    List<Movie> findByYearBetween(Integer year, Integer year2);

    //List<Movie> FindAll();

    @Query("SELECT m.title FROM Movie m WHERE m.year BETWEEN 2002 AND 2007")
    List<String> findTitlesByYearRange();

    @Query("SELECT m.rate FROM Movie m")
    List<Float> findRate();

}
