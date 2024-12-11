package com.example.javaweb.service;

import com.example.javaweb.pojo.AccountTable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    // 所有账号
    List<AccountTable> getAllAccounts();
    // 添加账号
    int addAccount(AccountTable account);
}