package com.example.javaweb.service;

import com.example.javaweb.pojo.OrdersTable;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface OrdersService {
    // 生成订单
    boolean addOrders(OrdersTable ordersTable);
    // 查找订单
    OrdersTable selectOrder(int orderNumber);
}
