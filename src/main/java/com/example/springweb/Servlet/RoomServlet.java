package com.example.springweb.Servlet;

import com.example.springweb.Entity.RoomTable;
import com.example.springweb.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RoomServlet {

    @Autowired
    private RoomService roomService;

    @RequestMapping(value = "/getRooms", method = RequestMethod.GET)
    @ResponseBody
    public List<RoomTable> getRooms() {
        return roomService.findAllRoom();
    }

    @RequestMapping(value = "/addRoom", method = RequestMethod.POST)
    @ResponseBody
    public boolean addRoom(@RequestBody RoomTable roomTable) {
        return roomService.addRoom(roomTable);
    }

    @RequestMapping(value = "/deleteRoom", method = RequestMethod.DELETE)
    @ResponseBody
    public boolean deleteRoom(@RequestParam("roomId") int roomId) {
        RoomTable roomTable = new RoomTable();
        roomTable.setRoom_id(roomId);
        return roomService.deleteRoom(roomTable);
    }

    @RequestMapping(value = "/updateRoom", method = RequestMethod.PUT)
    @ResponseBody
    public boolean updateRoom(@RequestBody RoomTable roomTable) {
        return roomService.updateRoom(roomTable);
    }
}