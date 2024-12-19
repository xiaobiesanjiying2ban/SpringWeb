package com.example.javaweb.controller;

import com.example.javaweb.pojo.Result;
import com.example.javaweb.pojo.SeatsHall5Table;
import com.example.javaweb.service.SeatsHall5Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/seatehall5")
public class SeateHall5Controller {
    @Autowired
    private SeatsHall5Service seatsHall5Service;

    // 查询所有座位
    @PostMapping("/all")
    public Result selectAllSeatsHall() {
        List<SeatsHall5Table> cinemahallsTables = seatsHall5Service.selectAllSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 查询已购买座位
    @PostMapping("/yes-use")
    public Result selectYesSeatsHall() {
        List<SeatsHall5Table> cinemahallsTables = seatsHall5Service.selectYesSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 查询未购买座位
    @PostMapping("/no-use")
    public Result selectNoSeatsHall() {
        List<SeatsHall5Table> cinemahallsTables = seatsHall5Service.selectNoSeatsHall();
        return Result.success(cinemahallsTables);
    }

    // 更新座位
    @PostMapping("/update")
    public Result updateSeatsHall(@RequestParam Integer id, @RequestParam String is_booked) {
        SeatsHall5Table seatsHall5Table = new SeatsHall5Table();
        seatsHall5Table.setId(id);
        seatsHall5Table.setIs_booked(is_booked);
        int update = seatsHall5Service.updateSeatsHall(seatsHall5Table);
        return update > 0 ? Result.success("更新成功") : Result.error("更新失败");
    }
}
