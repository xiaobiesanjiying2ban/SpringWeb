package com.example.javaweb.sevice.impl;

import com.example.javaweb.mapper.AccountMapper;
import com.example.javaweb.pojo.AccountTable;
import com.example.javaweb.sevice.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountMapper accountMapper;
    @Autowired
    public AccountServiceImpl(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    public List<AccountTable> getAllAccounts() {
        return accountMapper.findAllAccounts();
    }
}