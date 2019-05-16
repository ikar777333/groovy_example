package com.ikar.example.groovy.rest.server.services

import com.ikar.example.groovy.rest.server.repositories.entities.User

interface UserService {

    void add(User user)

    List<User> listUsers()

}