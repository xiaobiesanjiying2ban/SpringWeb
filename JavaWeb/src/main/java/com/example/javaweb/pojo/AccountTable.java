package com.example.javaweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountTable {
    private int id; //编号
    private String username;  //用户名
    private String account;  //账号
    private String password;  //密码
    private String identity;  //身份
    private String reName;  //真实姓名
    private String reId;  //身份证
}
