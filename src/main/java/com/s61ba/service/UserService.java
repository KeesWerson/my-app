package com.s61ba.service;

import com.s61ba.dao.UserDAO;
import com.s61ba.domain.Message;
import com.s61ba.domain.User;

import java.util.List;

/**
 * Created by Kees on 15/05/2017.
 */
public class UserService {

    private UserDAO userDAO;

    public UserService() {
        this.userDAO = new UserDAO();
    }

    public Message postMessage(int userid, String tekst){
        return userDAO.postMessage(userid, tekst);
    }

    public List<Message> getMessages(int userid){
        return userDAO.getMessages(userid);
    }
}
