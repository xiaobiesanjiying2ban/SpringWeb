package com.example.springweb.Entity;

import java.sql.Time;
import java.util.Objects;

public class MovieTable {
    private int id; //电影编号
    private String name; //电影名称
    private String director; //导演名称
    private Time ReleaseTime; //上映时间
    private String actor; //演员
//    private String synopsis; //简介

    public MovieTable(int id, String name, String director, Time releaseTime, String actor) {
        this.id = id;
        this.name = name;
        this.director = director;
        ReleaseTime = releaseTime;
        this.actor = actor;
//        this.synopsis = synopsis;
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
        MovieTable movieTable = (MovieTable) o;
        return id == movieTable.id && Objects.equals(name, movieTable.name) && Objects.equals(director, movieTable.director) && Objects.equals(ReleaseTime, movieTable.ReleaseTime) && Objects.equals(actor, movieTable.actor);
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
