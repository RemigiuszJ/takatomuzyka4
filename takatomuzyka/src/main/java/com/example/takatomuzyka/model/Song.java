package com.example.takatomuzyka.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String genre;
    private String ismn;
    private String year;


    @ManyToMany
    private Set<com.example.takatomuzyka.model.Artist> artists = new HashSet<>();

    public Song() {
    }

    public Song(String title, String genre, String ismn, String year) {
        this.title = title;
        this.genre = genre;
        this.ismn = ismn;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsmn() {
        return ismn;
    }

    public void setIsmn(String ismn) {
        this.ismn = ismn;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Set<com.example.takatomuzyka.model.Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<com.example.takatomuzyka.model.Artist> artists) {
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", ismn='" + ismn + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
