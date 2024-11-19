package com.example.springweb.Entity;

import java.sql.Time;
import java.util.Objects;

public class MovieTable {
    private int id; //电影编号
    private String name; //电影名称
    private String director; //导演名称
    private Time release_time; //上映时间
    private String actor; //演员
//    private String synopsis; //简介


    @Override
    public String toString() {
        return "MovieTable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", release_time=" + release_time +
                ", actor='" + actor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieTable that = (MovieTable) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(director, that.director) && Objects.equals(release_time, that.release_time) && Objects.equals(actor, that.actor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, director, release_time, actor);
    }

    public MovieTable(int id, String name, String director, Time release_time, String actor) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.release_time = release_time;
        this.actor = actor;
    }

    public MovieTable() {
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

    public Time getRelease_time() {
        return release_time;
    }

    public void setRelease_time(Time release_time) {
        this.release_time = release_time;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
