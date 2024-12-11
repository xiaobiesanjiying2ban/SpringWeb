package com.example.javaweb.controller;

import com.example.javaweb.pojo.OrdersTable;
import com.example.javaweb.pojo.Result; // 确保Result类在正确的包路径下
import com.example.javaweb.service.OrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Random;

@Slf4j
@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrdersService ordersService;

    // 添加订单
    @PostMapping("/add")
    public Result addOrders(String Movie, String PersonalInfo, Integer CinemaHallInfo, LocalDateTime MovieTime) {
        LocalDateTime now = LocalDateTime.now();
        OrdersTable ordersTable = new OrdersTable();
        ordersTable.setMovie(Movie);
        Random random = new Random();
        ordersTable.setOrderNumber(10000000 + random.nextInt(9000000));
        ordersTable.setOrderTime(now);
        ordersTable.setPersonalInfo(PersonalInfo);
        ordersTable.setCinemaHallInfo(CinemaHallInfo);
        ordersTable.setMovieTime(MovieTime);
        boolean add = ordersService.addOrders(ordersTable);
        return add ? Result.success("订单添加成功") : Result.error("订单添加失败");
    }

    // 查询订单
    @PostMapping("/select")
    public Result selectOrders(@RequestParam Integer OrderNumber) {
        OrdersTable ordersTable = ordersService.selectOrder(OrderNumber);
        return Result.success(ordersTable);
    }
}