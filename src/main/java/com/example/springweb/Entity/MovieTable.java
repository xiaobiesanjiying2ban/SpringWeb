package com.example.springweb.Entity;

import lombok.Data;

import java.sql.Time;
import java.util.Objects;

@Data
public class MovieTable {
    private int id; //电影编号
    private String name; //电影名称
    private String director; //导演名称
    private Time release_time; //上映时间
    private String actor; //演员
//    private String synopsis; //简介
}
