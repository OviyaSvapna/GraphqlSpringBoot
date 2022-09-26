package com.example.graphqlspringboothb.entity;

import com.example.graphqlspringboothb.request.CreateUserRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user_hb")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String userName;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "password")
    private String password;

    @Column(name = "confirm_password")
    private String confirmPassword;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;


    public User(CreateUserRequest createUserRequest) {
        this.name =createUserRequest.getName();
        this.userName = createUserRequest.getUserName();
        this.mobile = createUserRequest.getMobile();
        this.password = createUserRequest.getPassword();
        this.confirmPassword = createUserRequest.getConfirmPassword();
        this.email = createUserRequest.getEmail();
        this.address = createUserRequest.getAddress();
        this.city = createUserRequest.getCity();
        this.state = createUserRequest.getState();
    }

}
