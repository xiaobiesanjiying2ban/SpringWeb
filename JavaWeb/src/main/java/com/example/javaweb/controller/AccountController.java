package com.example.javaweb.controller;

import com.example.javaweb.pojo.AccountTable;
import com.example.javaweb.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;
    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<AccountTable> getAllAccounts() {
        log.info("获取所有账号");
        return accountService.getAllAccounts();
    }

    @PostMapping
    public boolean addAccount(@RequestBody AccountTable account) {
        log.info("请求添加账号");
        return accountService.addAccount(account);
    }
}