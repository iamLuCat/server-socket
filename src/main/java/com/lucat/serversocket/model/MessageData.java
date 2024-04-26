package com.lucat.serversocket.model;

import lombok.Data;

import java.util.Date;

@Data
public class MessageData {
    private String message;

    private String uuid;

    private String username;

    private String timestamp;
}
