package com.example.javaweb.mapper;


import com.example.javaweb.pojo.OrdersTable;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrdersMapper {
    //生成订单
    @Insert("insert into orders(Movie,OrderNumber,PersonalInfo,CinemaHallInfo,MovieTime) values (#{Movie},#{OrderNumber},#{PersonalInfo},#{CinemaHallInfo},#{MovieTime})")
    int insertOrders(OrdersTable ordersTable);
    //查找订单
    @Select("SELECT * FROM orders WHERE OrderNumber = #{OrderNumber}")
    OrdersTable selectOrdersByOrderNumber(@Param("OrderNumber") int orderNumber);
}
