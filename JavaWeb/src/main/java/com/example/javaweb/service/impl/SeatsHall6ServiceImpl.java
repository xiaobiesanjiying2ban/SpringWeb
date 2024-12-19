package com.example.javaweb.service.impl;

import com.example.javaweb.mapper.SeatsHall6Mapper;
import com.example.javaweb.pojo.SeatsHall6Table;
import com.example.javaweb.service.SeatsHall6Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatsHall6ServiceImpl implements SeatsHall6Service {
    @Autowired
    private SeatsHall6Mapper seatsHall6Mapper;

    // 查询所有座位
    @Override
    public List<SeatsHall6Table> selectAllSeatsHall() {
        return seatsHall6Mapper.selectAllSeats();
    }

    // 查询已购买座位
    @Override
    public List<SeatsHall6Table> selectYesSeatsHall() {
        return seatsHall6Mapper.selectYesSeats();
    }

    // 查询未购买座位
    @Override
    public List<SeatsHall6Table> selectNoSeatsHall() {
        return seatsHall6Mapper.selectNoSeats();
    }

    // 更新座位座位
    @Override
    public int updateSeatsHall(SeatsHall6Table seatsHall6) {
        return seatsHall6Mapper.updateSeats(seatsHall6);
    }
}
