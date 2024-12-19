package com.example.javaweb.controller;

import com.example.javaweb.pojo.Result;
import com.example.javaweb.pojo.SeatsHall1Table;
import com.example.javaweb.service.SeatsHall1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/seatehall1")
public class SeateHall1Controller {
    @Autowired
    private SeatsHall1Service seatsHall1Service;

    // 查询所有座位
    @PostMapping("/all")
    public Result selectAllSeatsHall() {
        List<SeatsHall1Table> cinemahallsTables = seatsHall1Service.selectAllSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 查询已购买座位
    @PostMapping("/yes-use")
    public Result selectYesSeatsHall() {
        List<SeatsHall1Table> cinemahallsTables = seatsHall1Service.selectYesSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 查询未购买座位
    @PostMapping("/no-use")
    public Result selectNoSeatsHall() {
        List<SeatsHall1Table> cinemahallsTables = seatsHall1Service.selectNoSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 更新座位
    @PostMapping("/update")
    public Result updateSeatsHall(@RequestParam Integer id, @RequestParam String is_booked) {
        SeatsHall1Table seatsHall1Table = new SeatsHall1Table();
        seatsHall1Table.setId(id);
        seatsHall1Table.setIs_booked(is_booked);
        int update = seatsHall1Service.updateSeatsHall(seatsHall1Table);
        return update > 0 ? Result.success("更新成功") : Result.error("更新失败");
    }
}
