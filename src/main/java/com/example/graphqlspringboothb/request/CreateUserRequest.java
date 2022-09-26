package com.example.graphqlspringboothb.request;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
public class CreateUserRequest
{

    private String name;

    private String userName;

    private String mobile;

    private String password;

    private String confirmPassword;

    private String email;

    private String address;

    private String city;

    private String state;

}
