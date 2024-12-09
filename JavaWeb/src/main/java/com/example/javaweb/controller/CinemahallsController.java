package com.example.javaweb.controller;

import com.example.javaweb.pojo.CinemahallsTable;
import com.example.javaweb.service.CinemahallsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/cinemahalls")
public class CinemahallsController {

    private final CinemahallsService cinemahallsService;

    @Autowired
    public CinemahallsController(CinemahallsService cinemahallsService) {
        this.cinemahallsService = cinemahallsService;
    }

    // 查询未使用影厅
    @PostMapping("/no-use")
    public List<CinemahallsTable> selectNoCinemahalls() {
        return cinemahallsService.selectNoCinemahalls();
    }

    // 查询已使用影厅
    @PostMapping("/yes-use")
    public List<CinemahallsTable> selectYesCinemahalls() {
        return cinemahallsService.selectYesCinemahalls();
    }

    // 更新影厅状态
    @PostMapping("/update")
    public boolean updateCinemahallStatus(@RequestBody CinemahallsTable cinemahallsTable) {
        return cinemahallsService.updateCinemahall(cinemahallsTable.getId(), Integer.parseInt(cinemahallsTable.getIs_in_use()));
    }
}
