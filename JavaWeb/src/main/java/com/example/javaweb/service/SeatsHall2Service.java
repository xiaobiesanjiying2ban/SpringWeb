package com.example.javaweb.service;

import com.example.javaweb.pojo.SeatsHall2Table;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeatsHall2Service {
    // 查询所有座位
    List<SeatsHall2Table> selectAllSeatsHall();
    // 查询已购买座位
    List<SeatsHall2Table> selectYesSeatsHall();
    // 查询未购买座位
    List<SeatsHall2Table> selectNoSeatsHall();
    // 更新座位座位
    int updateSeatsHall(SeatsHall2Table seatsHall2);
}
