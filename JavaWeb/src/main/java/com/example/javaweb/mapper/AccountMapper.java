package com.example.javaweb.mapper;

import com.example.javaweb.pojo.AccountTable;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountMapper {
    // 查询所有账号
    @Select("select * from account_table")
    List<AccountTable> findAllAccounts();
    // 添加账号
    @Insert("INSERT INTO account_table (username, account, password, re_name, re_id) VALUES (#{username}, #{account}, #{password}, #{re_name}, #{re_id})")
    int insertAccount(AccountTable account);
}