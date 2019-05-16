package com.ikar.example.groovy.rest.server.rest.controllers.impl

import com.ikar.example.groovy.rest.server.rest.controllers.UserController
import com.ikar.example.groovy.rest.server.rest.entities.UserDTO
import com.ikar.example.groovy.rest.server.services.UserService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserControllerImpl implements UserController{

    UserService userService

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
