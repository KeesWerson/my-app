package com.s61ba.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kees on 15/05/2017.
 */
public class User {

    private static int lastId = 0;

    private int id;
    private String username;
    private String password;
    private List<Message> messages = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.id = lastId++;
    }


}
