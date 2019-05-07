package com.ikar.example.groovy.rest.server.controllers

import javax.jws.WebService

@WebService(endpointInterface = "com.ikar.example.groovy.rest.server.controllers.MessageController")
class MessageControllerImpl implements MessageController {


    @Override
    def test() {
        return null
    }
}
