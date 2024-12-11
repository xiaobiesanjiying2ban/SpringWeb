package com.example.javaweb.controller;

import com.example.javaweb.pojo.AccountTable;
import com.example.javaweb.pojo.Result;
import com.example.javaweb.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private  AccountService accountService;
    
    // 查询所有账号
    @PostMapping("/all")
    public Result getAllAccounts() {
        return Result.success ( accountService.getAllAccounts () );
    }

    // 添加账号
    @PostMapping("/add")
    public Result addAccount(String username, String account,String password ,String re_name,String re_id) {
        int i = accountService.addAccount ( new AccountTable ( 1 , username , account , password , "identity" , re_name , re_id ) );
        return Result.success ( "成功添加"+i+ "条用户数据");
    }
}