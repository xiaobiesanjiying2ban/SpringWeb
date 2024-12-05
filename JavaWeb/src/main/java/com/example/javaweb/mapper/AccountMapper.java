package com.example.javaweb.mapper;

import com.example.javaweb.pojo.AccountTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountMapper {
    @Select("select * from account_table")
    List<AccountTable> findAllAccounts();
}