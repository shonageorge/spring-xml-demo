package com.stackroute.spring.bean;

public class Movie {
    String movieName;
    String genre;
    Actor actor;

    public Movie(){}

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    @Override
    public String toString() {
        return "movieName='" + movieName + '\'' + ", genre='" + genre + '\'' + ", " + actor + '}';
    }
}
