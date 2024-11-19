package com.example.springweb.Entity;

import java.util.Objects;

public class RoomTable {
    private int room_id;
    private String cinema_hall;
    private String state;

    @Override
    public String toString() {
        return "RoomTable{" +
                "room_id=" + room_id +
                ", cinema_hall='" + cinema_hall + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomTable roomTable = (RoomTable) o;
        return room_id == roomTable.room_id && Objects.equals(cinema_hall, roomTable.cinema_hall) && Objects.equals(state, roomTable.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(room_id, cinema_hall, state);
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getCinema_hall() {
        return cinema_hall;
    }

    public void setCinema_hall(String cinema_hall) {
        this.cinema_hall = cinema_hall;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public RoomTable(int room_id, String cinema_hall, String state) {
        this.room_id = room_id;
        this.cinema_hall = cinema_hall;
        this.state = state;
    }

    public RoomTable() {
    }
}
