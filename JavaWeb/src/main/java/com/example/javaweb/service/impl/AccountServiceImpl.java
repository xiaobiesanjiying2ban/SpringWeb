package com.example.javaweb.service.impl;

import com.example.javaweb.mapper.AccountMapper;
import com.example.javaweb.pojo.AccountTable;
import com.example.javaweb.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private  AccountMapper accountMapper;
    

    // 所有账号
    @Override
    public List<AccountTable> getAllAccounts() {
        return accountMapper.findAllAccounts();
    }

    // 添加账号
    @Override
    public int addAccount(AccountTable account){
	    return accountMapper.insertAccount ( account );
    }
}