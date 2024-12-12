package com.example.javaweb.mapper;

import com.example.javaweb.pojo.CinemahallsTable;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CinemahallsMapper {
    // 增加影厅
    @Insert("insert into cinema_halls(hall_name, is_in_use) values (#{hall_name}, #{is_in_use})")
    int insertCinemahalls(CinemahallsTable cinemahallsTable);
    // 查询未使用影厅
    @Select("select * from cinema_halls where is_in_use = 0")
    List<CinemahallsTable> selectNoCinemahalls();
    // 查询已使用影厅
    @Select("select * from cinema_halls where is_in_use = 1")
    List<CinemahallsTable> selectYesCinemahalls();
    // 查询所有影厅
    @Select("select * from cinema_halls")
    List<CinemahallsTable> selectAllCinemahalls();
    // 更新影厅状态
    @Update("update cinema_halls set hall_name=#{hall_name}, is_in_use=#{is_in_use} where id=#{id}")
    int updateCinemahall(CinemahallsTable cinemahallsTable);
}
