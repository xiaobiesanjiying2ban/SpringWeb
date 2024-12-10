package com.example.javaweb.mapper;

import com.example.javaweb.pojo.MovieTable;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MovieMapper {
    // 增加电影
    @Insert("insert into movie(Image, MovieName, MovieAddress, Director, Cast, MovieLength, ReleaseDate, Brief, Status) " +
            "values (#{Image}, #{MovieName}, #{MovieAddress}, #{Director}, #{Cast}, #{MovieLength}, #{ReleaseDate}, #{Brief}, #{Status})")
    int insertMovie(MovieTable movieTable);

    // 删除电影
    @Delete("delete from movie where MovieId = #{MovieId}")
    int deleteMovie(int movieId);

    // 更改电影
    @Update("update movie set Image=#{Image}, MovieName = #{MovieName}, MovieAddress = #{MovieAddress}, " +
            "Director = #{Director}, Cast = #{Cast}, MovieLength = #{MovieLength}, ReleaseDate = #{ReleaseDate}, " +
            "Brief = #{Brief}, Status = #{Status} where MovieId = #{MovieId}")
    int updateMovie(MovieTable movieTable);

    // 查找所有电影
    @Select("select * from movie")
    List<MovieTable> selectAllMovie();

    // 更根名称查找电影
    @Select("select * from movie where MovieName like concat('%', #{MovieName}, '%')")
    List<MovieTable> selectMovieByMovieName(String movieName);
}