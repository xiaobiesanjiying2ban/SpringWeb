package com.example.javaweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieTable {
    private int MovieId;  // 电影编号
    private String Image;  // 图片
    private String MovieName;  // 电影名
    private String MovieAddress;  // 地区
    private String Director;  // 导演
    private String Cast;  // 演员表
    private int MovieLength;  // 片长
    private String ReleaseDate;  // 上映时间
    private String Brief;  // 简介
    private int Status;  // 电影状态 （放映中或者未放映）
    private String AddDate;  // 添加时间
}
