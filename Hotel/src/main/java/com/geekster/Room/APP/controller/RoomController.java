package com.geekster.Room.APP.controller;


import com.geekster.Room.APP.model.Room;
import com.geekster.Room.APP.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    //post api

    @PostMapping("room")
    public String addRoom(@RequestBody Room newRoom)
    {
        return roomService.addRoom(newRoom);
    }



    //get api

    @GetMapping("rooms")
    public List<Room> getRooms()
    {
        return roomService.getRooms();
    }

    @DeleteMapping("room/{id}/id")
    public String deleteRoomById(@PathVariable Integer id){
        return roomService.deleteRoomById(id);
    }

}
