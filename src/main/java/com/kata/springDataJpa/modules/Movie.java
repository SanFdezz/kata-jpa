package com.kata.springDataJpa.modules;

import com.kata.springDataJpa.enums.Genres;
import javax.persistence.*;

@Entity
@Table(name = "Movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = false) // no sé si es necesario
    private String title;
    @Enumerated(EnumType.STRING) // revisar
    @Column(nullable = false, unique = false)
    private Genres genre;
    @Column(nullable = false, unique = false)
    private Integer year;
    @Column(nullable = false, unique = false)
    private Float rate;
    @Column(nullable = false, unique = false)
    private String sinopsis;

    public Movie(){}
    public Movie(String title, Genres genre, Integer year, Float rate, String sinopsis) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rate = rate;
        this.sinopsis = sinopsis;
    }


    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Genres getGenre() {
        return genre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public Float getRate() {
        return rate;
    }

    public Integer getYear() {
        return year;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
