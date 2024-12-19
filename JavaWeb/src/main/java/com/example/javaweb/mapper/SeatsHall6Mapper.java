package com.example.javaweb.mapper;

import com.example.javaweb.pojo.SeatsHall6Table;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface SeatsHall6Mapper {
    // 查询所有位置
    @Select("select * from seats_hall_6")
    List<SeatsHall6Table> selectAllSeats();
    // 查询已购买位置
    @Select("select * from seats_hall_6 where is_booked = 1")
    List<SeatsHall6Table> selectYesSeats();
    // 查询未购买位置
    @Select("select * from seats_hall_6 where is_booked = 0")
    List<SeatsHall6Table> selectNoSeats();
    // 更新座位状态
    @Update("update seats_hall_6 set is_booked = #{is_booked} where id = #{id}")
    int updateSeats(SeatsHall6Table seatsHall6Table);
}
