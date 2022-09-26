package com.example.graphqlspringboothb.service;

import com.example.graphqlspringboothb.entity.Room;
import com.example.graphqlspringboothb.repository.RoomRepository;
import com.example.graphqlspringboothb.request.CreateRoomRequest;
import com.example.graphqlspringboothb.request.DeleteRoomRequest;
import com.example.graphqlspringboothb.request.UpdateRoomRequest;
import com.example.graphqlspringboothb.response.RoomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    RoomRepository roomRepository;


    public Room getRoomById (int id) {
        return roomRepository.findById(id).get();
    }

    public List<Room> findAll() {
        return roomRepository.findAll();
    }
    public Room createRoom(CreateRoomRequest createRoomRequest) {

        Room room=new Room(createRoomRequest);
        room = roomRepository.save(room);
        return room;
    }

    public String bookRoom(UpdateRoomRequest updateRoomRequest) {

        Room room=roomRepository.findByRoomNo(updateRoomRequest.getRoomNo());
        room.setFromDate(updateRoomRequest.getFromDate());
        room.setToDate(updateRoomRequest.getToDate());
        room.setStatus("occupied");
        Room updatedRoom=roomRepository.save(room);
        return  "Booking is Successful";
    }

    public String cancelRoom(DeleteRoomRequest deleteRoomRequest) {

        Room room=roomRepository.findByRoomNo(deleteRoomRequest.getRoomNo());
        room.setFromDate(null);
        room.setToDate(null);
        room.setStatus("available");
        Room deleteRoom=roomRepository.save(room);
        return "Booking is cancelled";
    }
}
