package com.example.javaweb.service;

import com.example.javaweb.pojo.SeatsHall5Table;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeatsHall5Service {
    // 查询所有座位
    List<SeatsHall5Table> selectAllSeatsHall();
    // 查询已购买座位
    List<SeatsHall5Table> selectYesSeatsHall();
    // 查询未购买座位
    List<SeatsHall5Table> selectNoSeatsHall();
    // 更新座位座位
    int updateSeatsHall(SeatsHall5Table seatsHall5);
}
