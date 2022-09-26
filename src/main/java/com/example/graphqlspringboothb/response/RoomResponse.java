package com.example.graphqlspringboothb.response;

import com.example.graphqlspringboothb.entity.Room;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RoomResponse
{

    private Integer id;
    private Integer beds;

    private int noOfPerson;

    private float roomFare;

    private String roomType;

    private int roomNo;

    private String status;

    private String fromDate;

    private String toDate;

    private Integer userid;

    private Room room;

    public RoomResponse(Room room) {
        this.room=room;
        this.beds = room.getBeds();
        this.noOfPerson = room.getNoOfPerson();
        this.roomFare = room.getRoomFare();
        this.roomType = room.getRoomType();
        this.roomNo = room.getRoomNo();
        this.status = room.getStatus();
        this.fromDate = room.getFromDate();
        this.toDate = room.getToDate();
        this.userid = room.getUserid();
    }

}
