package com.example.javaweb.service;

import com.example.javaweb.pojo.SeatsHall4Table;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeatsHall4Service {
    // 查询所有座位
    List<SeatsHall4Table> selectAllSeatsHall();
    // 查询已购买座位
    List<SeatsHall4Table> selectYesSeatsHall();
    // 查询未购买座位
    List<SeatsHall4Table> selectNoSeatsHall();
    // 更新座位座位
    int updateSeatsHall(SeatsHall4Table seatsHall4);
}
