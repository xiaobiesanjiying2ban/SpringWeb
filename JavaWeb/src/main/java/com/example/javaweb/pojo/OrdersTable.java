package com.example.javaweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersTable {
    private int id;  // 编号
    private String Movie; //看的什么电影
    private int OrderNumber;  //订单编号
    private LocalDateTime OrderTime;  //时间
    private String PersonalInfo;  //个人信息
    private int CinemaHallInfo;  //影厅信息
    private LocalDateTime MovieTime;  //观影时间
}
