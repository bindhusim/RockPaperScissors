package com.ebay.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by bsimhadri on 01/08/2017.
 */
public class Preferences {

    public static final int DRAW_RESULT = 0;
    public static final int CONTROL_ONE_WINS = 1;
    public static final int CONTROL_TWO_WINS = -1;

    //UNIQUE IDs

    public static final int ROCK_ID = 1;
    public static final int PAPER_ID = 2;
    public static final int SCISSORS_ID = 3;
    public static final int SOMETHING_NEW_ID = 4;
    public static final int LIZARD_ID = 5;

    public static final HashMap<Integer, List<Integer>> winningMap = new HashMap();
    static {
        //ROCK wins over
        winningMap.put(ROCK_ID, new ArrayList<Integer>() {
            {
                add(SCISSORS_ID);
                add(LIZARD_ID);
            }
        });

        //PAPER wins over
        winningMap.put(PAPER_ID, new ArrayList<Integer>() {
            {
                add(ROCK_ID);
                add(LIZARD_ID);
            }
        });

        //SCISSORS wins over
        winningMap.put(SCISSORS_ID, new ArrayList<Integer>() {
            {
                add(PAPER_ID);
                add(LIZARD_ID);
            }
        });

        //SOMETHING_NEW wins over
        winningMap.put(SOMETHING_NEW_ID, new ArrayList<Integer>() {
            {
                add(ROCK_ID);
                add(PAPER_ID);
                add(SCISSORS_ID);
            }
        });
        //SOMETHING_NEW wins over
        winningMap.put(LIZARD_ID, new ArrayList<Integer>() {
            {
                add(SOMETHING_NEW_ID);
            }
        });



    }
}
