package com.example.javaweb.service.impl;

import com.example.javaweb.mapper.SeatsHall3Mapper;
import com.example.javaweb.pojo.SeatsHall3Table;
import com.example.javaweb.service.SeatsHall3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatsHall3ServiceImpl implements SeatsHall3Service {
    @Autowired
    private SeatsHall3Mapper seatsHall3Mapper;

    // 查询所有座位
    @Override
    public List<SeatsHall3Table> selectAllSeatsHall() {
        return seatsHall3Mapper.selectAllSeats();
    }

    // 查询已购买座位
    @Override
    public List<SeatsHall3Table> selectYesSeatsHall() {
        return seatsHall3Mapper.selectYesSeats();
    }

    // 查询未购买座位
    @Override
    public List<SeatsHall3Table> selectNoSeatsHall() {
        return seatsHall3Mapper.selectNoSeats();
    }

    // 更新座位座位
    @Override
    public int updateSeatsHall(SeatsHall3Table seatsHall3) {
        return seatsHall3Mapper.updateSeats(seatsHall3);
    }
}
