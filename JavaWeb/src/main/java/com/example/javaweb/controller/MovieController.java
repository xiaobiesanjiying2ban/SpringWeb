package com.example.javaweb.controller;

import com.example.javaweb.pojo.MovieTable;
import com.example.javaweb.pojo.Result;
import com.example.javaweb.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private  MovieService movieService;

    // 增加电影
    @PostMapping("/add")
    public Result addMovie(@RequestParam String Image, @RequestParam String MovieName,
                           @RequestParam String MovieAddress, @RequestParam String Director,
                           @RequestParam String Cast, @RequestParam Integer MovieLength,
                           @RequestParam String ReleaseDate, @RequestParam String Brief,
                           @RequestParam Integer Status) {
        MovieTable movieTable = createMovieTable(1,Image, MovieName, MovieAddress, Director, Cast,
                MovieLength, ReleaseDate, Brief, Status);
        boolean add = movieService.addMovie(movieTable);
        return add ? Result.success("添加成功") : Result.error("添加失败");
    }

    // 删除电影
    @PostMapping("/delete")
    public Result deleteMovie(@RequestParam Integer movieId) {
        boolean delect = movieService.deleteMovie(movieId);
        return delect ? Result.success("删除成功"):Result.error("删除失败");
    }

    // 更改电影
    @PostMapping("/update")
    public Result updateMovie(@RequestParam Integer MovieId,@RequestParam String Image, @RequestParam String MovieName,
                              @RequestParam String MovieAddress, @RequestParam String Director,
                              @RequestParam String Cast, @RequestParam Integer MovieLength,
                              @RequestParam String ReleaseDate, @RequestParam String Brief,
                              @RequestParam Integer Status) {
        MovieTable movieTable = createMovieTable(MovieId, Image, MovieName, MovieAddress, Director, Cast,
                MovieLength, ReleaseDate, Brief, Status);
        boolean update = movieService.updateMovie(movieTable);
        return update ? Result.success("更新成功") : Result.error("更新失败");
    }

    // 静态工厂方法
    private static MovieTable createMovieTable(Integer MovieId, String Image, String MovieName, String MovieAddress,
                                               String Director, String Cast, Integer MovieLength,
                                               String ReleaseDate, String Brief, Integer Status) {
        MovieTable movieTable = new MovieTable();
        movieTable.setMovieId(MovieId);
        movieTable.setImage(Image);
        movieTable.setMovieName(MovieName);
        movieTable.setMovieAddress(MovieAddress);
        movieTable.setDirector(Director);
        movieTable.setCast(Cast);
        movieTable.setMovieLength(MovieLength);
        movieTable.setReleaseDate(ReleaseDate);
        movieTable.setBrief(Brief);
        movieTable.setStatus(Status);
        movieTable.setAddDate(LocalDateTime.now());
        return movieTable;
    }


    // 查找所有电影
    @PostMapping("/all")
    public List<MovieTable> getAllMovies() {
        return movieService.getAllMovies();
    }

    // 更根名称查找电影
    @PostMapping("/find")
    public Result findMovies(@RequestParam String movieName) {
        List<MovieTable> movies = movieService.findMovies(movieName);
        if (movies != null && !movies.isEmpty()) {
            return Result.success(movies);
        } else {
            return Result.error("未找到电影");
        }
    }
}
