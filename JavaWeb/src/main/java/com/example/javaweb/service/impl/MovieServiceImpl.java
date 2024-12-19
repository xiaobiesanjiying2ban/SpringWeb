package com.example.javaweb.service.impl;

import com.example.javaweb.mapper.MovieMapper;
import com.example.javaweb.pojo.MovieTable;
import com.example.javaweb.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieMapper movieMapper;
    
    // 增加电影
    @Override
    public boolean addMovie(MovieTable movieTable) {
        return movieMapper.insertMovie(movieTable) > 0;
    }
    // 删除电影
    @Override
    public boolean deleteMovie(int moveId) {
        return movieMapper.deleteMovie(moveId) > 0;
    }
    // 更改电影
    @Override
    public boolean updateMovie(MovieTable movieTable) {
        return movieMapper.updateMovie(movieTable) > 0;
    }
    // 查找所有电影
    @Override
    public List<MovieTable> getAllMovies() {
        return movieMapper.selectAllMovie();
    }
    // 更根名称查找电影
    @Override
    public List<MovieTable> findMovies(String movieName){
        return movieMapper.selectMovieByMovieName(movieName);
    }
	
	@Override
	public MovieTable getMovieInfo ( Integer movieId ) {
		return movieMapper.getMovieInfo(movieId);
	}
	
	
}
