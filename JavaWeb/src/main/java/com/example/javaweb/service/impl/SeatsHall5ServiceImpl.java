package com.example.javaweb.service.impl;

import com.example.javaweb.mapper.SeatsHall5Mapper;
import com.example.javaweb.pojo.SeatsHall5Table;
import com.example.javaweb.service.SeatsHall5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatsHall5ServiceImpl implements SeatsHall5Service {
    @Autowired
    private SeatsHall5Mapper seatsHall5Mapper;

    // 查询所有座位
    @Override
    public List<SeatsHall5Table> selectAllSeatsHall() {
        return seatsHall5Mapper.selectAllSeats();
    }

    // 查询已购买座位
    @Override
    public List<SeatsHall5Table> selectYesSeatsHall() {
        return seatsHall5Mapper.selectYesSeats();
    }

    // 查询未购买座位
    @Override
    public List<SeatsHall5Table> selectNoSeatsHall() {
        return seatsHall5Mapper.selectNoSeats();
    }

    // 更新座位座位
    @Override
    public int updateSeatsHall(SeatsHall5Table seatsHall5) {
        return seatsHall5Mapper.updateSeats(seatsHall5);
    }
}
