package com.example.javaweb.service.impl;

import com.example.javaweb.mapper.SeatsHall4Mapper;
import com.example.javaweb.pojo.SeatsHall4Table;
import com.example.javaweb.service.SeatsHall4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatsHall4ServiceImpl implements SeatsHall4Service {
    @Autowired
    private SeatsHall4Mapper seatsHall4Mapper;

    // 查询所有座位
    @Override
    public List<SeatsHall4Table> selectAllSeatsHall() {
        return seatsHall4Mapper.selectAllSeats();
    }

    // 查询已购买座位
    @Override
    public List<SeatsHall4Table> selectYesSeatsHall() {
        return seatsHall4Mapper.selectYesSeats();
    }

    // 查询未购买座位
    @Override
    public List<SeatsHall4Table> selectNoSeatsHall() {
        return seatsHall4Mapper.selectNoSeats();
    }

    // 更新座位座位
    @Override
    public int updateSeatsHall(SeatsHall4Table seatsHall4) {
        return seatsHall4Mapper.updateSeats(seatsHall4);
    }
}
