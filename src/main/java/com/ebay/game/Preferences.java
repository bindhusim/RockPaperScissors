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

    public static final HashMap<Integer, List<Integer>> winningMap = new HashMap();
    static {
        //ROCK wins over
        winningMap.put(ROCK_ID, new ArrayList<Integer>() {
            {
                add(SCISSORS_ID);
            }
        });

        //PAPER wins over
        winningMap.put(PAPER_ID, new ArrayList<Integer>() {
            {
                add(ROCK_ID);
            }
        });

        //SCISSORS wins over
        winningMap.put(SCISSORS_ID, new ArrayList<Integer>() {
            {
                add(PAPER_ID);
            }
        });

     }
}
