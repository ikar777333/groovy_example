package com.ikar.example.groovy.rest.server.services.impl

import com.ikar.example.groovy.rest.server.repositories.UserDao
import com.ikar.example.groovy.rest.server.repositories.entities.User
import com.ikar.example.groovy.rest.server.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional(readOnly = true)
    public List<User> listUsers() {
        return userDao.listUsers();
    }

}
