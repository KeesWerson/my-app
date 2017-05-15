package com.s61ba.dao;

import com.s61ba.domain.Message;
import com.s61ba.domain.User;

import java.util.List;

/**
 * Created by Kees on 15/05/2017.
 */
public class UserDAO {

    public UserDAO() {
    }

    public Message postMessage(int userid, String tekst){

        return new Message(tekst);
    }

    public List<Message> getMessages(int userid){

        return null;
    }
}
