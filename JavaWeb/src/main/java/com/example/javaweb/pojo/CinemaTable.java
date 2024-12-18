package com.example.javaweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CinemaTable {
    private int id;  // 电影院编号
    private String cinemaName;  // 电影院名称
    private String cinemaIntroduce;  // 电影院介绍
    private String cinemaPlace;  // 电影院地址
    private String phone;  // 电话号码
}
