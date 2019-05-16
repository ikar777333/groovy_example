package com.ikar.example.groovy.rest.server.repositories

import com.ikar.example.groovy.rest.server.repositories.entities.User

interface UserDao {
    void save(User user);
    List<User> list();
}
