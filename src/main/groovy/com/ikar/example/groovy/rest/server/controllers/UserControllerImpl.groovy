package com.ikar.example.groovy.rest.server.controllers

import com.ikar.example.groovy.rest.server.entities.UserDTO
import com.ikar.example.groovy.rest.server.repositories.UserRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserControllerImpl{

    UserRepository userRepository

    @GetMapping("/user")
    UserDTO getUserById(Integer id) {
        return new UserDTO(id: 1L, name: "User")
    }

    @PutMapping("/user")
    UserDTO addUser() {
        return null
    }

    @PostMapping("/user")
    UserDTO modifyUserById(Integer id) {
        return null
    }

    @DeleteMapping("/user")
    void deleteUserById(Integer id) {

    }
}
