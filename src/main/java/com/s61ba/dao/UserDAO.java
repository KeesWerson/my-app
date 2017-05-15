package com.s61ba.dao;

import com.s61ba.domain.Message;
import com.s61ba.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kees on 15/05/2017.
 */
public class UserDAO {

    public List<User> users = new ArrayList<>();

    public UserDAO() {
    }

    public Message postMessage(int userid, String tekst){
        User user  = getUserById(userid);

        if(user != null) {
            Message m = new Message(tekst);
            user.getMessages().add(m);
            return m;
        }

        return null;
    }

    public List<Message> getMessages(int userid){
        User u = getUserById(userid);

        if(u != null) {
            return u.getMessages();
        }

        return new ArrayList<>();
    }

    public User newUser(String username, String password) {
        User user = new User(username, password);

        if(getUserByUsername(username) != null) {
            return null;
        }

        users.add(user);

        return user;
    }

    private User getUserByUsername(String username) {
        for(User u : users) {
            if(u.getUsername().equals(username)) {
                return u;
            }
        }

        return null;
    }


    private User getUserById(int id) {
        for(User u : users) {
            if(u.getId() == id) {
                return u;
            }
        }

        return null;
    }
}
