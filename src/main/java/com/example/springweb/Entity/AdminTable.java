package com.example.springweb.Entity;

import lombok.Data;

import java.util.Objects;

@Data
public class AdminTable {
    private int id;
    private String user;
    private String password;
}
