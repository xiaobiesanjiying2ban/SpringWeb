package com.example.javaweb.service.impl;

import com.example.javaweb.mapper.OrdersMapper;
import com.example.javaweb.pojo.OrdersTable;
import com.example.javaweb.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private  OrdersMapper ordersMapper;
    
    // 添加订单
    @Override
    public boolean addOrders(OrdersTable ordersTable) {
        int result = ordersMapper.insertOrders(ordersTable);
        return result > 0;
    }

    // 查找订单
    @Override
    public OrdersTable selectOrder(int orderNumber) {
        return ordersMapper.selectOrdersByOrderNumber(orderNumber);
    }

}
