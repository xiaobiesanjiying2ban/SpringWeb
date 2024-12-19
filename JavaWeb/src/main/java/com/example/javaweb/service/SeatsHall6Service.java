package com.example.javaweb.service;

import com.example.javaweb.pojo.SeatsHall6Table;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeatsHall6Service {
    // 查询所有座位
    List<SeatsHall6Table> selectAllSeatsHall();
    // 查询已购买座位
    List<SeatsHall6Table> selectYesSeatsHall();
    // 查询未购买座位
    List<SeatsHall6Table> selectNoSeatsHall();
    // 更新座位座位
    int updateSeatsHall(SeatsHall6Table seatsHall6);
}
