package com.example.javaweb.controller;

import com.example.javaweb.pojo.Result;
import com.example.javaweb.pojo.SeatsHall4Table;
import com.example.javaweb.service.SeatsHall4Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/seatehall4")
public class SeateHall4Controller {
    @Autowired
    private SeatsHall4Service seatsHall4Service;

    // 查询所有座位
    @PostMapping("/all")
    public Result selectAllSeatsHall() {
        List<SeatsHall4Table> cinemahallsTables = seatsHall4Service.selectAllSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 查询已购买座位
    @PostMapping("/yes-use")
    public Result selectYesSeatsHall() {
        List<SeatsHall4Table> cinemahallsTables = seatsHall4Service.selectYesSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 查询未购买座位
    @PostMapping("/no-use")
    public Result selectNoSeatsHall() {
        List<SeatsHall4Table> cinemahallsTables = seatsHall4Service.selectNoSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 更新座位
    @PostMapping("/update")
    public Result updateSeatsHall(@RequestParam Integer id, @RequestParam String is_booked) {
        SeatsHall4Table seatsHall4Table = new SeatsHall4Table();
        seatsHall4Table.setId(id);
        seatsHall4Table.setIs_booked(is_booked);
        int update = seatsHall4Service.updateSeatsHall(seatsHall4Table);
        return update > 0 ? Result.success("更新成功") : Result.error("更新失败");
    }
}
