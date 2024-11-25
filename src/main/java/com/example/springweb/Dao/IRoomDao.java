package com.example.springweb.Dao;

import com.example.springweb.Entity.RoomTable;

import java.util.List;

public interface IRoomDao {
    //    增加影厅
    boolean addRoom(RoomTable roomTable);
    //    删除影厅
    boolean deleteRoom(RoomTable roomTable);
    //    更改影厅
    boolean updateRoom(RoomTable roomTable);
    //    查找影厅
    List<RoomTable> findAllRoom();
}
