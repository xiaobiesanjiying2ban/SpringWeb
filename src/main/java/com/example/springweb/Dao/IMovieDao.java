package com.example.springweb.Dao;

import com.example.springweb.Entity.Movie;

import java.util.List;

public interface IMovieDao {
//    增加电影
    boolean addMovie(Movie movie);
//    删除电影
    boolean deleteMovie(Movie movie);
//    更改电影详细
    boolean updateMovie(Movie movie);
//    查找单个电影
    boolean findMovieByTitle(String title);
//    查询所有电影
    List<Movie> findAllMovies();
}
