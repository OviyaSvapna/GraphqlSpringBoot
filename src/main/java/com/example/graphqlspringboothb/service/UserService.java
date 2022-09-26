package com.example.graphqlspringboothb.service;

import com.example.graphqlspringboothb.entity.User;
import com.example.graphqlspringboothb.repository.UserRepository;
import com.example.graphqlspringboothb.request.CreateUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;

    public User createUser(CreateUserRequest createUserRequest) {

        User user=new User(createUserRequest);
        user = userRepository.save(user);
        return user;
    }

}
