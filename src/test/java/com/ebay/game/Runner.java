package com.ebay.game;


import junit.framework.TestSuite;
import junit.framework.Test;

/**
 * Created by bsimhadri on 31/07/2017.
 */
public class Runner {

    public static Test suite(){

        TestSuite suite = new TestSuite();
        suite.addTestSuite(TestRock.class);
        return suite;
    }
}
