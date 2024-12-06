package com.example.javaweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentTable {
    private int id; // 编号
    private int MovieId; // 电影编号
    private String UserId; // 评价用户
    private int Scores; // 评分
    private String Content; // 评价内容
    private LocalDateTime CommentDate; // 评价时间
}
