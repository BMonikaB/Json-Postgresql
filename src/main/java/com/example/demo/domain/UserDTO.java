package com.example.demo.domain;

import lombok.Data;

@Data
public class UserDTO {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private boolean author;
    private boolean admin;

}
