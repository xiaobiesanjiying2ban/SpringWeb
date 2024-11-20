package com.example.springweb.Dao;

import com.example.springweb.Entity.AdminTable;

import java.util.List;

public interface IAdminDao {
//    增加管理员账号
    boolean addAdmin(AdminTable admin);
//    增删管理员账号
//    更改管理员账号
//    查询管理员账号
    List<AdminTable> selectAllAdmin();
}
