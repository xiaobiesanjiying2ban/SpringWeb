package com.example.javaweb.service;

import com.example.javaweb.pojo.CinemahallsTable;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CinemahallsService {
    // 增加影厅
    boolean addChinemahalls(CinemahallsTable cinemahallsTable);
    // 查询未使用影厅

    // 查询已使用影厅

    // 更新影厅状态

}
