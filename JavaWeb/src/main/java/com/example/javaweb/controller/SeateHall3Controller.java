package com.example.javaweb.controller;

import com.example.javaweb.pojo.Result;
import com.example.javaweb.pojo.SeatsHall3Table;
import com.example.javaweb.service.SeatsHall3Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/seatehall3")
public class SeateHall3Controller {
    @Autowired
    private SeatsHall3Service seatsHall3Service;

    // 查询所有座位
    @PostMapping("/all")
    public Result selectAllSeatsHall() {
        List<SeatsHall3Table> cinemahallsTables = seatsHall3Service.selectAllSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 查询已购买座位
    @PostMapping("/yes-use")
    public Result selectYesSeatsHall() {
        List<SeatsHall3Table> cinemahallsTables = seatsHall3Service.selectYesSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 查询未购买座位
    @PostMapping("/no-use")
    public Result selectNoSeatsHall() {
        List<SeatsHall3Table> cinemahallsTables = seatsHall3Service.selectNoSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 更新座位
    @PostMapping("/update")
    public Result updateSeatsHall(@RequestParam Integer id, @RequestParam String is_booked) {
        SeatsHall3Table seatsHall3Table = new SeatsHall3Table();
        seatsHall3Table.setId(id);
        seatsHall3Table.setIs_booked(is_booked);
        int update = seatsHall3Service.updateSeatsHall(seatsHall3Table);
        return update > 0 ? Result.success("更新成功") : Result.error("更新失败");
    }
}
