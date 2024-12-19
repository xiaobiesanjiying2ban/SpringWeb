package com.example.javaweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatsHall3Table {
    private int id;  // 作为id
    private int hall_id;  // 影厅id
    private String seat_number;  // 座位号
    private String is_booked;  // 是否被购买
}