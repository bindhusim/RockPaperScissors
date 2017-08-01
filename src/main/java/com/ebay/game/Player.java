package com.ebay.game;

/**
 * Created by bsimhadri on 01/08/2017.
 */
public class Player {

    public static Control generateNewControlInstance(int controlId) {

        switch (controlId) {
            case Preferences.ROCK_ID:
                return new Rock();
            case Preferences.PAPER_ID:
                return new Paper();
            case Preferences.SCISSORS_ID:
                return new Scissors();
            default:
                return new Paper();
        }

    }
}
