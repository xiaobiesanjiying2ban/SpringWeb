package com.example.javaweb.service.impl;

import com.example.javaweb.mapper.CinemaMapper;
import com.example.javaweb.pojo.CinemaTable;
import com.example.javaweb.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    private CinemaMapper cinemaMapper;

    // 增加电影院
    @Override
    public boolean addCinema(CinemaTable cinemaTable){
        return cinemaMapper.insertCinema(cinemaTable) > 0;
    }

    // 删除电影院
    @Override
    public boolean deleteCinema(int id){
        return cinemaMapper.deleteCinema(id) > 0;
    }

    // 修改电影院
    @Override
    public boolean updateCinema(CinemaTable cinemaTable){
        return cinemaMapper.updateCinema(cinemaTable) > 0;
    }

    // 查询所有电影院
    @Override
    public List<CinemaTable> getAllCinema(){
        return cinemaMapper.selectCinema();
    }

    // 根据名称查询电影院
    @Override
    public List<CinemaTable> getCinemaByName(String cinemaName) {
        return cinemaMapper.selectCinemaByCinemaName(cinemaName);
    }
}
