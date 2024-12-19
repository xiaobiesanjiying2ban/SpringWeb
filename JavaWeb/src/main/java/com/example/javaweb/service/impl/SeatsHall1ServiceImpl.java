package com.example.javaweb.service.impl;

import com.example.javaweb.mapper.SeatsHall1Mapper;
import com.example.javaweb.pojo.SeatsHall1Table;
import com.example.javaweb.service.SeatsHall1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatsHall1ServiceImpl implements SeatsHall1Service {
    @Autowired
    private SeatsHall1Mapper seatsHall1Mapper;


    // 查询所有座位
    @Override
    public List<SeatsHall1Table> selectAllSeatsHall() {
        return seatsHall1Mapper.selectAllSeats();
    }

    // 查询已购买座位
    @Override
    public List<SeatsHall1Table> selectYesSeatsHall() {
        return seatsHall1Mapper.selectYesSeats();
    }

    // 查询未购买座位
    @Override
    public List<SeatsHall1Table> selectNoSeatsHall() {
        return seatsHall1Mapper.selectNoSeats();
    }

    // 更新座位座位
    @Override
    public int updateSeatsHall(SeatsHall1Table seatsHall1) {
        return seatsHall1Mapper.updateSeats(seatsHall1);
    }
}
