package com.stackroute.spring.bean;

public class Movie {
    String movieName;
    String genre;
    Actor actor1;
    Actor actor2;
    Actor actor3;



    public Movie(){}


    public Movie(String movieName, String genre,Actor actor1,Actor actor2,Actor actor3) {
        this.movieName = movieName;
        this.genre = genre;
        this.actor1=actor1;
        this.actor2=actor2;
        this.actor3=actor3;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public Actor getActor1() {
        return actor1;
    }

    public Actor getActor2() {
        return actor2;
    }

    public Actor getActor3() {
        return actor3;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", genre='" + genre + '\'' +
                ", actor1" + actor1 +
                ", actor2" + actor2 +
                ", actor3" + actor3 +
                '}';
    }
}
