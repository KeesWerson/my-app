package com.s61ba.domain;

/**
 * Created by Kees on 15/05/2017.
 */
public class Message {

    private String tekst;

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public Message(String tekst) {
        this.tekst = tekst;
    }
}
