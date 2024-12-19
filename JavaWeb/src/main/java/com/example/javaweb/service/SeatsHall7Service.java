package com.example.javaweb.service;

import com.example.javaweb.pojo.SeatsHall7Table;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeatsHall7Service {
    // 查询所有座位
    List<SeatsHall7Table> selectAllSeatsHall();
    // 查询已购买座位
    List<SeatsHall7Table> selectYesSeatsHall();
    // 查询未购买座位
    List<SeatsHall7Table> selectNoSeatsHall();
    // 更新座位座位
    int updateSeatsHall(SeatsHall7Table seatsHall7);
}
