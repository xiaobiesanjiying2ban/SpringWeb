package com.example.javaweb;

import com.example.javaweb.pojo.AccountTable;
import com.example.javaweb.pojo.MovieTable;
import com.example.javaweb.pojo.OrdersTable;
import com.example.javaweb.service.AccountService;
import com.example.javaweb.service.OrdersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JavaWebApplicationTests {

	@Autowired
	private AccountService accountService;

    @Autowired
    private OrdersService ordersService;

	@Test
	public void selectMovieImg ( ){
	
	}

	


}