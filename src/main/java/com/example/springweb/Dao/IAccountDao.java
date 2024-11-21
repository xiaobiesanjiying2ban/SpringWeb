package com.example.springweb.Dao;

import com.example.springweb.Entity.AccountTable;

public interface IAccountDao {
    //    增加用户
    boolean addaccount(AccountTable accountTable);
    //    删除用户
    boolean deleteaccount(AccountTable accountTable);
    //    更改用户
    boolean updateaccount(AccountTable accountTable);
    //    查找用户
    AccountTable getaccountbyid(boolean manage);
}
