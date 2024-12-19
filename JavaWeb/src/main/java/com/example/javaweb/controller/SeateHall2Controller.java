package com.example.javaweb.controller;

import com.example.javaweb.pojo.Result;
import com.example.javaweb.pojo.SeatsHall2Table;
import com.example.javaweb.service.SeatsHall2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/seatehall2")
public class SeateHall2Controller {
    @Autowired
    private SeatsHall2Service seatsHall2Service;

    // 查询所有座位
    @PostMapping("/all")
    public Result selectAllSeatsHall() {
        List<SeatsHall2Table> cinemahallsTables = seatsHall2Service.selectAllSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 查询已购买座位
    @PostMapping("/yes-use")
    public Result selectYesSeatsHall() {
        List<SeatsHall2Table> cinemahallsTables = seatsHall2Service.selectYesSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 查询未购买座位
    @PostMapping("/no-use")
    public Result selectNoSeatsHall() {
        List<SeatsHall2Table> cinemahallsTables = seatsHall2Service.selectNoSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 更新座位
    @PostMapping("/update")
    public Result updateSeatsHall(@RequestParam Integer id, @RequestParam String is_booked) {
        SeatsHall2Table seatsHall2Table = new SeatsHall2Table();
        seatsHall2Table.setId(id);
        seatsHall2Table.setIs_booked(is_booked);
        int update = seatsHall2Service.updateSeatsHall(seatsHall2Table);
        return update > 0 ? Result.success("更新成功") : Result.error("更新失败");
    }
}
