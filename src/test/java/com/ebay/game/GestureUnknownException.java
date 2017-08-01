package com.ebay.game;

/**
 * Created by bsimhadri on 01/08/2017.
 */
public class GestureUnknownException extends Exception {
    private String message;

    public GestureUnknownException(String messages) {
        this.message = messages;
    }
}
