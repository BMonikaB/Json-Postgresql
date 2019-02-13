package com.example.demo.service;


import com.example.demo.domain.UserDTO;
import com.example.demo.persistence.model.User;
import com.example.demo.persistence.repository.UserRepo;

public interface UserService extends BaseService<User, Long, UserRepo> {

    public UserDTO createUser(UserDTO userDTO);

    public UserDTO editUser(UserDTO userDTO);
}