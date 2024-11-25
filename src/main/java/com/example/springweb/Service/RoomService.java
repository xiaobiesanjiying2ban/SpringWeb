package com.example.springweb.Service;

import com.example.springweb.Dao.IRoomDao;
import com.example.springweb.Entity.RoomTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    private IRoomDao roomDao;
//    添加
    public boolean addRoom(RoomTable roomTable){
        return roomDao.addRoom(roomTable);
    }
//    删除
    public boolean deleteRoom(RoomTable roomTable){
        return roomDao.deleteRoom(roomTable);
    }
//    更改
    public boolean updateRoom(RoomTable roomTable){
        return roomDao.updateRoom(roomTable);
    }
//    查询
    public List<RoomTable> getAllRoom(){
        return roomDao.findAllRoom();
    }
}
