package com.example.demo.service;

import com.example.demo.domain.UserDTO;
import com.example.demo.persistence.model.User;
import com.example.demo.persistence.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long, UserRepo> implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserRepo getRepository() {
        return userRepo;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User u = save(Mapper.dtoToUser(userDTO));
        return Mapper.userToDTO(u);
    }

    @Override
    public UserDTO editUser(UserDTO userDTO) {
        User u = save(Mapper.dtoToUser(userDTO));
        return Mapper.userToDTO(u);
    }
}