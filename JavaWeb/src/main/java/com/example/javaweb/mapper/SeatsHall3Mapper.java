package com.example.javaweb.mapper;

import com.example.javaweb.pojo.SeatsHall3Table;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface SeatsHall3Mapper {
    // 查询所有位置
    @Select("select * from seats_hall_3")
    List<SeatsHall3Table> selectAllSeats();
    // 查询已购买位置
    @Select("select * from seats_hall_3 where is_booked = 1")
    List<SeatsHall3Table> selectYesSeats();
    // 查询未购买位置
    @Select("select * from seats_hall_3 where is_booked = 0")
    List<SeatsHall3Table> selectNoSeats();
    // 更新座位状态
    @Update("update seats_hall_3 set is_booked = #{is_booked} where id = #{id}")
    int updateSeats(SeatsHall3Table seatsHall2Table);
}
