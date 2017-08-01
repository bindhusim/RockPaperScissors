package com.ebay.game;

import junit.framework.TestCase;

/**
 * Created by bsimhadri on 31/07/2017.
 */
public class TestRock extends TestCase {

    public void testPaperBeatsRock()  { //win

        Control paper = Player.generateNewControlInstance(Preferences.PAPER_ID);
        Control rock = Player.generateNewControlInstance(Preferences.ROCK_ID);

        int result = Verification.check(paper, rock);
        assertTrue(result == Preferences.CONTROL_ONE_WINS);
    }

    public void testRockBeatsScissors() { //win

        Control rock = Player.generateNewControlInstance(Preferences.ROCK_ID);
        Control scissors = Player.generateNewControlInstance(Preferences.SCISSORS_ID);

        int result = Verification.check(rock, scissors);
        assertTrue(result == Preferences.CONTROL_ONE_WINS);
    }

    public void testScissorsBeatsPaper()  { //win

        Control scissors = Player.generateNewControlInstance(Preferences.SCISSORS_ID);
        Control paper = Player.generateNewControlInstance(Preferences.PAPER_ID);

        int result = Verification.check(scissors, paper);
        assertTrue(result == Preferences.CONTROL_ONE_WINS);
    }

    public void testRockBeatsRock(){ //draw

        Control rockOne = Player.generateNewControlInstance(Preferences.ROCK_ID);
        Control rockTwo = Player.generateNewControlInstance(Preferences.ROCK_ID);

        int result = Verification.check(rockOne, rockTwo);
        assertTrue(result == Preferences.DRAW_RESULT);

    }

    public void testPaperBeatsPaper(){ //draw

        Control paperOne = Player.generateNewControlInstance(Preferences.ROCK_ID);
        Control paperTwo = Player.generateNewControlInstance(Preferences.ROCK_ID);

        int result = Verification.check(paperOne, paperTwo);
        assertTrue(result == Preferences.DRAW_RESULT);

    }

    public void testScissorsBeatsScissors(){ //draw

        Control scissorsOne = Player.generateNewControlInstance(Preferences.ROCK_ID);
        Control scissorsTwo = Player.generateNewControlInstance(Preferences.ROCK_ID);

        int result = Verification.check(scissorsOne, scissorsTwo);
        assertTrue(result == Preferences.DRAW_RESULT);

    }

    public void testPaperLosesOnScissors(){ //Loose

        Control paper = Player.generateNewControlInstance(Preferences.PAPER_ID);
        Control scissors = Player.generateNewControlInstance(Preferences.SCISSORS_ID);

        int result = Verification.check(paper, scissors);
        assertTrue(result == Preferences.CONTROL_TWO_WINS);

    }

    public void testRockLosesOnPaper(){ //Loose

        Control rock = Player.generateNewControlInstance(Preferences.ROCK_ID);
        Control paper = Player.generateNewControlInstance(Preferences.PAPER_ID);

        int result = Verification.check(rock, paper);
        assertTrue(result == Preferences.CONTROL_TWO_WINS);

    }

    public void testScissorsLosesOnRock(){ //Loose

        Control scissors = Player.generateNewControlInstance(Preferences.SCISSORS_ID);
        Control rock = Player.generateNewControlInstance(Preferences.ROCK_ID);

        int result = Verification.check(scissors, rock);
        assertTrue(result == Preferences.CONTROL_TWO_WINS);

    }

}
