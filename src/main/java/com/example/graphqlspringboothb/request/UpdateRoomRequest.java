package com.example.graphqlspringboothb.request;

import com.example.graphqlspringboothb.entity.Room;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateRoomRequest
{

    private int roomNo;

    private String status;

    private String fromDate;

    private String toDate;

    private Integer userid;
}
