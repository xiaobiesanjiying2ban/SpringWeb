package com.example.javaweb.service;

import com.example.javaweb.pojo.SeatsHall3Table;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeatsHall3Service {
    // 查询所有座位
    List<SeatsHall3Table> selectAllSeatsHall();
    // 查询已购买座位
    List<SeatsHall3Table> selectYesSeatsHall();
    // 查询未购买座位
    List<SeatsHall3Table> selectNoSeatsHall();
    // 更新座位座位
    int updateSeatsHall(SeatsHall3Table seatsHall3);
}
