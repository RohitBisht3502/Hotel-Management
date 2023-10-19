package com.geekster.Room.APP.service;


import com.geekster.Room.APP.model.Room;
import com.geekster.Room.APP.repo.IRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class RoomService {

    @Autowired
    IRoomRepo roomRepo;

    public String addRoom(Room newRoom) {

        roomRepo.save(newRoom);
        return "room added";

    }

    public List<Room> getRooms() {

        return (List<Room>) roomRepo.findAll();
    }

    public String deleteRoomById(Integer id) {
        try{
            Room room=roomRepo.findById(id).orElseThrow(()-> new NoSuchElementException("room not found with id"+ id));
            roomRepo.deleteById(id);
            return "Room deleted successfully";
        }catch (Exception e){
            return "Error:" +e.getMessage();
        }


    }
}
