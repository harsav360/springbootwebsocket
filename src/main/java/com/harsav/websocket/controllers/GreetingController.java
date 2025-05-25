package com.harsav.websocket.controllers;

import com.harsav.websocket.dto.Message;
import com.harsav.websocket.dto.ResponseMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @MessageMapping("/hello")             // Maps to /app/hello
    @SendTo("/topic/greetings")           // Sends to /topic/greetings
    public ResponseMessage greet(Message message) {
        return new ResponseMessage("Hello, " + message.getContent() + "!");
    }
}