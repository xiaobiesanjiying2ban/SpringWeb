package com.example.javaweb.controller;

import com.example.javaweb.pojo.OrdersTable;
import com.example.javaweb.service.OrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrdersService ordersService;

    @Autowired
    public OrderController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    // 添加订单
    @PostMapping("/add")
    public String addOrders(@RequestBody OrdersTable ordersTable) {
        log.info("添加订单: {}", ordersTable);
        boolean isAdded = ordersService.addOrders(ordersTable);
        if (isAdded) {
            return "订单添加成功";
        } else {
            return "订单添加失败";
        }
    }

    // 查询订单
    @PostMapping("/select")
    public OrdersTable selectOrders(@RequestBody OrdersTable ordersTable) {
        log.info("查询订单，订单编号: {}", ordersTable.getOrderNumber());
        OrdersTable order = ordersService.selectOrder(ordersTable.getOrderNumber());
        if (order != null) {
            return order;
        } else {
            return null;
        }
    }
}