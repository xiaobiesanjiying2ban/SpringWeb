package com.example.javaweb.service;

import com.example.javaweb.pojo.MovieTable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {
    // 增加电影
    boolean addMovie(MovieTable movieTable);
    // 删除电影
    boolean deleteMovie(int movieId);
    // 更改电影
    boolean updateMovie(MovieTable movieTable);
    // 查找所有电影
    List<MovieTable> getAllMovies();
    // 更根名称查找电影
    List<MovieTable> findMovies(String movieName);
    
    //查找对应的电影信息
    MovieTable getMovieInfo ( Integer movieId );
}
