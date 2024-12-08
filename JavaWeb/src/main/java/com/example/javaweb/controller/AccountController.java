package com.example.javaweb.controller;

import com.example.javaweb.pojo.AccountTable;
import com.example.javaweb.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // 查询所有账号
    @PostMapping("/all")
    public List<AccountTable> getAllAccounts() {
        log.info("获取所有账号");
        return accountService.getAllAccounts();
    }

    // 添加账号
    @PostMapping("/add")
    public boolean addAccount(@RequestBody AccountTable accountTable) {
        log.info("请求添加账号: {}", accountTable);
        return accountService.addAccount(accountTable);
    }
}