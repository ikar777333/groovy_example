package com.ikar.example.groovy.rest.server.rest.controllers

import com.ikar.example.groovy.rest.server.rest.entities.UserDTO
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping

interface UserController {

    @GetMapping("/user")
    UserDTO getUserById(Integer id)

    @PutMapping("/user")
    UserDTO addUser()

    @PostMapping("/user")
    UserDTO modifyUserById(Integer id)

    @DeleteMapping("/user")
    void deleteUserById(Integer id)
}