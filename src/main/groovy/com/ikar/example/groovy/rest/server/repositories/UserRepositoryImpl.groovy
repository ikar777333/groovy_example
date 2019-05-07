package com.ikar.example.groovy.rest.server.repositories

import com.ikar.example.groovy.rest.server.entities.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepositoryImpl extends CrudRepository<User, Long> {

    User findById(long id);

}
