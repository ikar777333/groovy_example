package com.ikar.example.groovy.rest.server.controllers

import javax.jws.WebMethod
import javax.jws.WebService

@WebService
interface MessageController {

    @WebMethod
    def test();

}