package com.ebay.game;

import java.util.List;

/**
 * Created by bsimhadri on 01/08/2017.
 */
public class Verification {

    public static int check(final Control controlOne, final Control controlTwo) {
        if (controlOne.getId() == controlTwo.getId()) {
            return Preferences.DRAW_RESULT;
        }

        final List<Integer> winningList = Preferences.winningMap.get(controlOne.getId());

        if (winningList != null && winningList.contains(controlTwo.getId())) {
            return Preferences.CONTROL_ONE_WINS;
        }

        return Preferences.CONTROL_TWO_WINS;
    }
}
