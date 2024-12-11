package com.example.javaweb.controller;

import com.example.javaweb.pojo.MovieTable;
import com.example.javaweb.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private  MovieService movieService;
    
    // 增加电影
    @PostMapping("/add")
    public boolean addMovie(@RequestBody MovieTable movieTable) {
        return movieService.addMovie(movieTable);
    }

    // 删除电影
    @PostMapping("/delete/{movieId}")
    public boolean deleteMovie(@PathVariable int movieId) {
        return movieService.deleteMovie(movieId);
    }

    // 更改电影
    @PostMapping("/update")
    public boolean updateMovie(@RequestBody MovieTable movieTable) {
        return movieService.updateMovie(movieTable);
    }

    // 查找所有电影
    @PostMapping("/all")
    public List<MovieTable> getAllMovies() {
        return movieService.getAllMovies();
    }

    // 更根名称查找电影
    @PostMapping("/find/{movieName}")
    public List<MovieTable> findMovies(@PathVariable String movieName) {
        return movieService.findMovies(movieName);
    }
}
