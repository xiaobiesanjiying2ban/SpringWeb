package com.example.javaweb.controller;

import com.example.javaweb.pojo.Result;
import com.example.javaweb.pojo.SeatsHall7Table;
import com.example.javaweb.service.SeatsHall7Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/seatehall7")
public class SeateHall7Controller {
    @Autowired
    private SeatsHall7Service seatsHall7Service;

    // 查询所有座位
    @PostMapping("/all")
    public Result selectAllSeatsHall() {
        List<SeatsHall7Table> cinemahallsTables = seatsHall7Service.selectAllSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 查询已购买座位
    @PostMapping("/yes-use")
    public Result selectYesSeatsHall() {
        List<SeatsHall7Table> cinemahallsTables = seatsHall7Service.selectYesSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 查询未购买座位
    @PostMapping("/no-use")
    public Result selectNoSeatsHall() {
        List<SeatsHall7Table> cinemahallsTables = seatsHall7Service.selectNoSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 更新座位
    @PostMapping("/update")
    public Result updateSeatsHall(@RequestParam Integer id, @RequestParam String is_booked) {
        SeatsHall7Table seatsHall7Table = new SeatsHall7Table();
        seatsHall7Table.setId(id);
        seatsHall7Table.setIs_booked(is_booked);
        int update = seatsHall7Service.updateSeatsHall(seatsHall7Table);
        return update > 0 ? Result.success("更新成功") : Result.error("更新失败");
    }
}
