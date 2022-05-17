package com.example.demo.model;

import java.time.LocalDateTime;

public class Message {

    private String author;
    private String message;
    private LocalDateTime timeStamp;

    public Message(String author, String message) {
        this.author = author;
        this.message = message;
        this.timeStamp = LocalDateTime.now();
    }

    public Message(){} /*ce constructeur permet d'accepterv la methode vide dans le controller)*/

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
