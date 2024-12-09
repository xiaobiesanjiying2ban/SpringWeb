package com.example.javaweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CinemahallsTable {
    private int id; // 电影院id
    private String hall_name; // 几号影厅
    private String is_in_use; // 是否在使用中
}
