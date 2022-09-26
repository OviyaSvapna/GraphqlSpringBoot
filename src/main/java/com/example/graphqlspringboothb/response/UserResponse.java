package com.example.graphqlspringboothb.response;

import com.example.graphqlspringboothb.entity.User;
import com.example.graphqlspringboothb.request.CreateUserRequest;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class UserResponse {

    private Integer id;

    private String name;

    private String userName;

    private String mobile;

    private String password;

    private String confirmPassword;

    private String email;

    private String address;

    private String city;

    private String state;

    private User user;

    public UserResponse(User user) {
        this.user=user;
        this.name = user.getName();
        this.userName =user.getUserName();
        this.mobile = user.getMobile();
        this.password = user.getPassword();
        this.confirmPassword = user.getConfirmPassword();
        this.email = user.getEmail();
        this.address = user.getAddress();
        this.city = user.getCity();
        this.state = user.getState();
    }



}
