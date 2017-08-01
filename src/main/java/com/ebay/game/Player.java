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
            case Preferences.SOMETHING_NEW_ID:
                return new Scissors();
            case  Preferences.LIZARD_ID:
                return new Lizard();
            default:
                return new Paper();
        }

    }
}
