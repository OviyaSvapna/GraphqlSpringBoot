package com.example.graphqlspringboothb.mutation;

import com.example.graphqlspringboothb.entity.Room;
import com.example.graphqlspringboothb.request.CreateUserRequest;
import com.example.graphqlspringboothb.response.RoomResponse;
import com.example.graphqlspringboothb.response.UserResponse;
import com.example.graphqlspringboothb.service.RoomService;
import com.example.graphqlspringboothb.service.UserService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryImpl implements GraphQLQueryResolver {

    @Autowired
    UserService userService;

    @Autowired
    RoomService roomService;

    public Boolean getUser(Long userId) {
        return true;
    }

    public RoomResponse room(int id)
    {
        return new RoomResponse(roomService.getRoomById(id));
    }

}
