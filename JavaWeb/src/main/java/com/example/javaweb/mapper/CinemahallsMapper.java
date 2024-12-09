package com.example.javaweb.mapper;

import com.example.javaweb.pojo.CinemahallsTable;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface CinemahallsMapper {
    // 增加影厅
    @Insert("insert into cinema_halls(hall_name, is_in_use) values (#{hall_name}, #{is_in_use})")
    int insertCinemahalls(CinemahallsTable cinemahallsTable);
    // 查询影厅是否使用
//    @Select("select ")
    // 更新影厅状态
}
