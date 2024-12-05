package com.example.javaweb.sevice;

import com.example.javaweb.pojo.AccountTable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

    List<AccountTable> getAllAccounts();
}