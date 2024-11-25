package com.example.springweb.Dao.Impl;

import com.example.springweb.Dao.IRoomDao;
import com.example.springweb.Entity.RoomTable;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoomDaoImpl implements IRoomDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public boolean addRoom(RoomTable roomTable) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            session.insert("com.example.springweb.Entity.RoomTable.insertRoom", roomTable);
            session.commit();
            return true;
        }
    }

    @Override
    public boolean deleteRoom(RoomTable roomTable) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            session.delete("com.example.springweb.Entity.RoomTable.deleteRoom", roomTable);
            session.commit();
            return true;
        }
    }

    @Override
    public boolean updateRoom(RoomTable roomTable) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            session.update("com.example.springweb.Entity.RoomTable.updateRoom", roomTable);
            session.commit();
            return true;
        }
    }

    @Override
    public List<RoomTable> findAllRoom() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.selectList("com.example.springweb.Entity.RoomTable.selectAllRoom");
        }
    }
}