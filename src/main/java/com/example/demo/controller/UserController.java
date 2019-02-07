package com.example.demo.controller;

import com.example.demo.domain.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {


    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(value = "/registry")
    public UserDTO registry(@RequestBody UserDTO user) {
        return user;
    }

    @PutMapping(value = "/edit")
    public UserDTO edit(@RequestBody UserDTO user) {
        return user;
    }

    @PutMapping(value = "confirm/{id}")
    public UserDTO confirm(@PathVariable("id") Long id) {
        return new UserDTO();
    }

    @PutMapping(value = "/add")
    public UserDTO add(@RequestBody UserDTO user) {
        return user;
    }

}
