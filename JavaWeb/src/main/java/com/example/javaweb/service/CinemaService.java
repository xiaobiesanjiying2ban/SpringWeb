package com.example.javaweb.service;

import com.example.javaweb.pojo.CinemaTable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CinemaService {
    // 增加电影院
    boolean addCinema(CinemaTable cinemaTable);
    // 删除电影院
    boolean deleteCinema(int id);
    // 修改电影院
    boolean updateCinema(CinemaTable cinemaTable);
    // 查询所有电影院
    List<CinemaTable> getAllCinema();
    // 根据名称查询电影院
    List<CinemaTable> getCinemaByName(String cinemaName);
}
