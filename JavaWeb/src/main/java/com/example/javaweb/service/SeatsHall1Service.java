package com.example.javaweb.service;

import com.example.javaweb.pojo.SeatsHall1Table;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeatsHall1Service {
    // 查询所有座位
    List<SeatsHall1Table> selectAllSeatsHall();
    // 查询已购买座位
    List<SeatsHall1Table> selectYesSeatsHall();
    // 查询未购买座位
    List<SeatsHall1Table> selectNoSeatsHall();
    // 更新座位座位
    int updateSeatsHall(SeatsHall1Table seatsHall1);
}
