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
    @GetMapping("/select")
    public OrdersTable selectOrders(@RequestParam int orderNumber) {
        log.info("查询订单，订单编号: {}", orderNumber);
        OrdersTable ordersTable = ordersService.selectOrder(orderNumber);
        if (ordersTable != null) {
            return ordersTable;
        } else {
            return null;
        }
    }
}