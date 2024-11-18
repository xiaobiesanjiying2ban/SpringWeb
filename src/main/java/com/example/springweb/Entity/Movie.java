package com.example.springweb.Entity;

import java.sql.Time;
import java.util.Objects;

public class Movie {
    private int id; //电影编号
    private String name; //电影名称
    private String director; //导演名称
    private Time ReleaseTime; //上映时间
    private String actor; //演员
//    private String synopsis; //简介

    public Movie(int id, String name, String director, Time releaseTime, String actor) {
        this.id = id;
        this.name = name;
        this.director = director;
        ReleaseTime = releaseTime;
        this.actor = actor;
//        this.synopsis = synopsis;
    }

    public Movie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Time getReleaseTime() {
        return ReleaseTime;
    }

    public void setReleaseTime(Time releaseTime) {
        ReleaseTime = releaseTime;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

//    public String getSynopsis() {
//        return synopsis;
//    }

//    public void setSynopsis(String synopsis) {
//        this.synopsis = synopsis;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id && Objects.equals(name, movie.name) && Objects.equals(director, movie.director) && Objects.equals(ReleaseTime, movie.ReleaseTime) && Objects.equals(actor, movie.actor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, director, ReleaseTime, actor);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", ReleaseTime=" + ReleaseTime +
                ", actor='" + actor + '\'' +
                '}';
    }
}
