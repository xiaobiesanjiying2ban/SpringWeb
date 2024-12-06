package com.example.javaweb;

import com.example.javaweb.pojo.AccountTable;
import com.example.javaweb.pojo.OrdersTable;
import com.example.javaweb.service.AccountService;
import com.example.javaweb.service.OrdersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JavaWebApplicationTests {

	@Autowired
	private AccountService accountService;

    @Autowired
    private OrdersService ordersService;

	//Account 表

	//查询所有账号
	@Test
	void getAllAccounts() {
		// 调用服务层方法
		List<AccountTable> accounts = accountService.getAllAccounts();
		System.out.println("全部数据为：");
		for (AccountTable account : accounts) {
			System.out.println(account);
		}
	}

	//添加账号
	@Test
	void addAccount(){
		AccountTable account = new AccountTable();
		account.setUsername("李四");
		account.setAccount("mislisi");
		account.setPassword("123456");
		account.setRe_name("李四");
		account.setRe_id("39482958271843728");

		boolean isAdded = accountService.addAccount(account);
		System.out.println(isAdded);
	}

	// Orders表

	// 添加订单
	@Test
	void addOrders(){
		OrdersTable ordersTable = new OrdersTable();
		ordersTable.setMovie("战狼2");
		ordersTable.setOrderNumber(20248806);
		ordersTable.setPersonalInfo("王五");
		ordersTable.setCinemaHallInfo(1);

		boolean isadded = ordersService.addOrders(ordersTable);
		System.out.println(isadded);
	}

	// 查找订单
	@Test
	void selectOrder(){
		int num = 20248806;
		OrdersTable ordersTable = ordersService.selectOrder(num);
		System.out.println(ordersTable);
	}
}