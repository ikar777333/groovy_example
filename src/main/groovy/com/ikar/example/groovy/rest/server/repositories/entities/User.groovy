package com.ikar.example.groovy.rest.server.repositories.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
class User {

    @Id
    @GeneratedValue
    long id
    String name
}
