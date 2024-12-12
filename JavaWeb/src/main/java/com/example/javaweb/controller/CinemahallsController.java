package com.example.javaweb.controller;

import com.example.javaweb.pojo.CinemahallsTable;
import com.example.javaweb.pojo.Result;
import com.example.javaweb.service.CinemahallsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/cinemahalls")
public class CinemahallsController {
    CinemahallsTable cinemahallsTable = new CinemahallsTable();

    @Autowired
    private  CinemahallsService cinemahallsService;

    // 增加影厅
    @PostMapping("/add")
    public Result insertCinemahalls(String hall_name , String is_in_use) {
        cinemahallsTable.setHall_name(hall_name);
        cinemahallsTable.setIs_in_use(is_in_use);
        boolean success = cinemahallsService.addChinemahalls(cinemahallsTable);
        return success ? Result.success("增加成功"):Result.error("增加失败");
    }
    // 查询未使用影厅
    @PostMapping("/no-use")
    public Result selectNoCinemahalls() {
        List<CinemahallsTable> cinemahallsTables = cinemahallsService.selectNoCinemahalls();
        return Result.success(cinemahallsTables);
    }

    // 查询已使用影厅
    @PostMapping("/yes-use")
    public Result selectYesCinemahalls() {
        List<CinemahallsTable> cinemahallsTables = cinemahallsService.selectYesCinemahalls();
        return Result.success(cinemahallsTables);
    }

    // 查询所有影厅
    @PostMapping("/all-use")
    public Result selectAllCinemahalls() {
        List<CinemahallsTable> cinemahallsTables = cinemahallsService.selectAllCinemahalls();
        return Result.success(cinemahallsTables);
    }

    // 更新影厅信息
    @PostMapping("/update")
    public Result updateCinemahall(@RequestParam int id,
                                   @RequestParam String hall_name,
                                   @RequestParam String is_in_use
                                   ) {
        CinemahallsTable cinemahallsTable = new CinemahallsTable();
        cinemahallsTable.setId(id);
        cinemahallsTable.setHall_name(hall_name);
        cinemahallsTable.setIs_in_use(is_in_use);
        boolean success = cinemahallsService.updateCinemahall(cinemahallsTable);
        return success ? Result.success("更新成功") : Result.error("更新失败");
    }
}
