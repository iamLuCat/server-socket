package com.lucat.serversocket.controller;

import com.lucat.serversocket.model.MessageData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public MessageData chat(@Payload Message<MessageData> message) {
        try {
            return message.getPayload();
        } catch (Exception e) {
            log.error("Error occurred while processing message", e);
            throw e;
        }
    }
}
