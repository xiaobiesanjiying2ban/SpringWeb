package com.example.springweb.Dao;

import com.example.springweb.Entity.MovieTable;

import java.util.List;

public interface IMovieDao {
//    增加电影
    boolean addMovie(MovieTable movieTable);
//    删除电影
    boolean deleteMovie(MovieTable movieTable);
//    更改电影详细
    boolean updateMovie(MovieTable movieTable);
//    查找单个电影
    boolean findMovieByTitle(String title);
//    查询所有电影
    List<MovieTable> findAllMovies();
}
