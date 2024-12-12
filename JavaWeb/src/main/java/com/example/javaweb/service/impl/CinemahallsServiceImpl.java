package com.example.javaweb.service.impl;

import com.example.javaweb.mapper.CinemahallsMapper;
import com.example.javaweb.pojo.CinemahallsTable;
import com.example.javaweb.service.CinemahallsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemahallsServiceImpl implements CinemahallsService {
    @Autowired
    private  CinemahallsMapper cinemahallsMapper;
    
    // 增加影厅
    @Override
    public boolean addChinemahalls(CinemahallsTable cinemahallsTable) {
        return cinemahallsMapper.insertCinemahalls(cinemahallsTable) > 0;
    }
    // 查询未使用影厅
    @Override
    public List<CinemahallsTable> selectNoCinemahalls(){
        return cinemahallsMapper.selectNoCinemahalls();
    }
    // 查询已使用影厅
    @Override
    public List<CinemahallsTable> selectYesCinemahalls(){
        return cinemahallsMapper.selectYesCinemahalls();
    }
    // 查询所有影厅
    @Override
    public List<CinemahallsTable> selectAllCinemahalls(){
        return cinemahallsMapper.selectAllCinemahalls();
    }
    // 更新影厅状态
    @Override
    public boolean updateCinemahall(CinemahallsTable cinemahallsTable) {
        return cinemahallsMapper.updateCinemahall(cinemahallsTable) > 0;
    }
}
