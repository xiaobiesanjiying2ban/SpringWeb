package com.example.javaweb.service.impl;

import com.example.javaweb.mapper.SeatsHall2Mapper;
import com.example.javaweb.pojo.SeatsHall2Table;
import com.example.javaweb.service.SeatsHall2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatsHall2ServiceImpl implements SeatsHall2Service {
    @Autowired
    private SeatsHall2Mapper seatsHall2Mapper;

    // 查询所有座位
    @Override
    public List<SeatsHall2Table> selectAllSeatsHall() {
        return seatsHall2Mapper.selectAllSeats();
    }

    // 查询已购买座位
    @Override
    public List<SeatsHall2Table> selectYesSeatsHall() {
        return seatsHall2Mapper.selectYesSeats();
    }

    // 查询未购买座位
    @Override
    public List<SeatsHall2Table> selectNoSeatsHall() {
        return seatsHall2Mapper.selectNoSeats();
    }

    // 更新座位座位
    @Override
    public int updateSeatsHall(SeatsHall2Table seatsHall2) {
        return seatsHall2Mapper.updateSeats(seatsHall2);
    }
}
