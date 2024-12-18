package com.example.javaweb.mapper;

import com.example.javaweb.pojo.CinemaTable;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CinemaMapper {
    // 增加电影院
    @Insert("insert into cinema(cinemaName,cinemaIntroduce,cinemaPlace,phone) values (#{cinemaName},#{cinemaIntroduce},#{cinemaPlace},#{phone})")
    int insertCinema(CinemaTable cinemaTable);
    // 删除电影院
    @Delete("delete from cinema where id = #{id}")
    int deleteCinema(int id);
    // 修改电影院
    @Update("update cinema set cinemaName=#{cinemaName},cinemaIntroduce=#{cinemaIntroduce},cinemaPlace=#{cinemaPlace},phone=#{phone} where id = #{id}")
    int updateCinema(CinemaTable cinemaTable);
    // 查询所有电影院
    @Select("select * from cinema")
    List<CinemaTable> selectCinema();
    // 根据名称查询电影院
    @Select("select * from cinema where cinemaName = #{cinemaName}")
    List<CinemaTable> selectCinemaByCinemaName(String cinemaName);
}
