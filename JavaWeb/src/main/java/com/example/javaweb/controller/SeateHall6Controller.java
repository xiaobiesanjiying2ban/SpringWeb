package com.example.javaweb.controller;

import com.example.javaweb.pojo.Result;
import com.example.javaweb.pojo.SeatsHall6Table;
import com.example.javaweb.service.SeatsHall6Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/seatehall6")
public class SeateHall6Controller {
    @Autowired
    private SeatsHall6Service seatsHall6Service;

    // 查询所有座位
    @PostMapping("/all")
    public Result selectAllSeatsHall() {
        List<SeatsHall6Table> cinemahallsTables = seatsHall6Service.selectAllSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 查询已购买座位
    @PostMapping("/yes-use")
    public Result selectYesSeatsHall() {
        List<SeatsHall6Table> cinemahallsTables = seatsHall6Service.selectYesSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 查询未购买座位
    @PostMapping("/no-use")
    public Result selectNoSeatsHall() {
        List<SeatsHall6Table> cinemahallsTables = seatsHall6Service.selectNoSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 更新座位
    @PostMapping("/update")
    public Result updateSeatsHall(@RequestParam Integer id, @RequestParam String is_booked) {
        SeatsHall6Table seatsHall6Table = new SeatsHall6Table();
        seatsHall6Table.setId(id);
        seatsHall6Table.setIs_booked(is_booked);
        int update = seatsHall6Service.updateSeatsHall(seatsHall6Table);
        return update > 0 ? Result.success("更新成功") : Result.error("更新失败");
    }
}
