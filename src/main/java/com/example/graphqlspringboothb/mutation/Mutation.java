package com.example.graphqlspringboothb.mutation;

import com.example.graphqlspringboothb.entity.Room;
import com.example.graphqlspringboothb.request.CreateRoomRequest;
import com.example.graphqlspringboothb.request.CreateUserRequest;
import com.example.graphqlspringboothb.request.DeleteRoomRequest;
import com.example.graphqlspringboothb.request.UpdateRoomRequest;
import com.example.graphqlspringboothb.response.RoomResponse;
import com.example.graphqlspringboothb.response.UserResponse;
import com.example.graphqlspringboothb.service.RoomService;
import com.example.graphqlspringboothb.service.UserService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mutation implements GraphQLMutationResolver
{
    @Autowired
    UserService userService;

    @Autowired
    RoomService roomService;


//    public Iterable<Room> findAll()
//    {
//        Iterable<Room> rooms=roomService.findAll();
//        return rooms;
//    }

    public UserResponse createUser(CreateUserRequest createUserRequest)
    {
        return  new UserResponse(userService.createUser(createUserRequest));

    }

    public RoomResponse createRoom(CreateRoomRequest createRoomRequest)
    {
        return  new RoomResponse(roomService.createRoom(createRoomRequest));

    }
    public String bookRoom(UpdateRoomRequest updateRoomRequest)
    {
        String result=roomService.bookRoom(updateRoomRequest);
        return result;
    }

    public String cancelRoom(DeleteRoomRequest deleteRoomRequest)
    {
        String result=roomService.cancelRoom(deleteRoomRequest);
        return result;
    }
}


