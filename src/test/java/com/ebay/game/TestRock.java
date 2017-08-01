package com.ebay.game;

import junit.framework.TestCase;

/**
 * Created by bsimhadri on 31/07/2017.
 */
public class TestRock extends TestCase {

    public void testPaperBeatsRock() throws Exception {

        Control paper = Player.generateNewControlInstance(Preferences.PAPER_ID);
        Control rock = Player.generateNewControlInstance(Preferences.ROCK_ID);

        int result = Verification.check(paper, rock);
        assertTrue(result == Preferences.CONTROL_ONE_WINS);
    }

    public void testRockBeatsScissors() throws Exception {

        Control rock = Player.generateNewControlInstance(Preferences.ROCK_ID);
        Control scissors = Player.generateNewControlInstance(Preferences.SCISSORS_ID);

        int result = Verification.check(rock, scissors);
        assertTrue(result == Preferences.CONTROL_ONE_WINS);
    }

    public void testScissorsBeatsPaper() throws Exception {

        Control scissors = Player.generateNewControlInstance(Preferences.SCISSORS_ID);
        Control paper = Player.generateNewControlInstance(Preferences.PAPER_ID);

        int result = Verification.check(scissors, paper);
        assertTrue(result == Preferences.CONTROL_ONE_WINS);
    }


}
