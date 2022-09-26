package com.example.graphqlspringboothb.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateRoomRequest
{

    private Integer beds;

    private int noOfPerson;

    private float roomFare;

    private String roomType;

    private int roomNo;

    private String status;


}
