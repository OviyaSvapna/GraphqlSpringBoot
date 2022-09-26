package com.example.graphqlspringboothb.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteRoomRequest
{

    private int roomNo;

    private String status;

    private String fromDate;

    private String toDate;

    private Integer userid;
}
