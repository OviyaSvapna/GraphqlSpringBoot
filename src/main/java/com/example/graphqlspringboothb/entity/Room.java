package com.example.graphqlspringboothb.entity;

import com.example.graphqlspringboothb.request.CreateRoomRequest;
import com.example.graphqlspringboothb.request.DeleteRoomRequest;
import com.example.graphqlspringboothb.request.UpdateRoomRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "room_hb")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "beds")
    private int beds;

    @Column(name = "no_person")
    private int noOfPerson;

    @Column(name = "room_fare")
    private float roomFare;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "room_no")
    private int roomNo;

    @Column(name = "status")
    private String status;

    @Column(name = "Fromdate")
    private String fromDate;

    @Column(name = "Todate")
    private String toDate;

    @Column(name = "userid")
    private Integer userid;

    public Room(CreateRoomRequest createRoomRequest) {
        this.beds = createRoomRequest.getBeds();
        this.noOfPerson = createRoomRequest.getNoOfPerson();
        this.roomFare = createRoomRequest.getRoomFare();
        this.roomType = createRoomRequest.getRoomType();
        this.roomNo = createRoomRequest.getRoomNo();
        this.status = createRoomRequest.getStatus();
    }

    public Room(UpdateRoomRequest updateRoomRequest) {
        this.roomNo = updateRoomRequest.getRoomNo();
        this.status = updateRoomRequest.getStatus();
        this.fromDate = updateRoomRequest.getFromDate();
        this.toDate = updateRoomRequest.getToDate();
    }

    public Room(DeleteRoomRequest deleteRoomRequest) {
        this.roomNo = deleteRoomRequest.getRoomNo();
        this.status = deleteRoomRequest.getStatus();
        this.fromDate = deleteRoomRequest.getFromDate();
        this.toDate = deleteRoomRequest.getToDate();

    }
    public Room() {

    }





}
