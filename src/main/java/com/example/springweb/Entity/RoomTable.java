package com.example.springweb.Entity;

import lombok.Data;

import java.util.Objects;

@Data
public class RoomTable {
    private int room_id;
    private String cinema_hall;
    private String state;
}
