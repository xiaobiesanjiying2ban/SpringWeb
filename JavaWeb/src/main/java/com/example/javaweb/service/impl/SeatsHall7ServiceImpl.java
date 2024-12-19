package com.example.javaweb.service.impl;

import com.example.javaweb.mapper.SeatsHall7Mapper;
import com.example.javaweb.pojo.SeatsHall7Table;
import com.example.javaweb.service.SeatsHall7Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatsHall7ServiceImpl implements SeatsHall7Service {
    @Autowired
    private SeatsHall7Mapper seatsHall7Mapper;

    // 查询所有座位
    @Override
    public List<SeatsHall7Table> selectAllSeatsHall() {
        return seatsHall7Mapper.selectAllSeats();
    }

    // 查询已购买座位
    @Override
    public List<SeatsHall7Table> selectYesSeatsHall() {
        return seatsHall7Mapper.selectYesSeats();
    }

    // 查询未购买座位
    @Override
    public List<SeatsHall7Table> selectNoSeatsHall() {
        return seatsHall7Mapper.selectNoSeats();
    }

    // 更新座位座位
    @Override
    public int updateSeatsHall(SeatsHall7Table seatsHall3) {
        return seatsHall7Mapper.updateSeats(seatsHall3);
    }
}
