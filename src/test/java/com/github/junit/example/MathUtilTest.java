package com.github.junit.example;

import org.apache.log4j.Logger;
import org.junit.*;
import static org.junit.Assert.*;

public class MathUtilTest {
    private final static Logger LOGGER = Logger.getLogger(MathUtilTest.class);

    private MathUtil mathUtil;

    @Before
    public void setUp(){
        LOGGER.info("********* SETTING UP *********");
        mathUtil = new MathUtil();
        LOGGER.info("********* SETTING UP SUCCESSFUL *********");
    }

    @After
    public void down(){
        LOGGER.info("********* SETTING DOWN *********");
        mathUtil = null;
        LOGGER.info("********* SETTING DOWN SUCCESSFUL *********");
    }

    @Test
    public void sumTest(){
        LOGGER.info("********* SUM TEST *********");
        assertEquals(4, mathUtil.sum(2, 2));
    }

    @Test
    public void multiplyTest(){
        LOGGER.info("********* MULTIPLY TEST *********");
        assertEquals(6, mathUtil.multiply(3, 2));
    }

    @Test
    public void residueTest(){
        LOGGER.info("********* RESIDUE TEST *********");
        assertEquals(2, mathUtil.residue(2, 4));
    }

    @Test
    public void factorialTest(){
        LOGGER.info("********* FACTORIAL TEST *********");
        assertEquals(2, mathUtil.factorial(2));
    }

    @Test(expected = RuntimeException.class)
    public void factorialNegativeNumberTest(){
        LOGGER.info("********* FACTORIAL WITH NEGATIVE TEST *********");
        mathUtil.factorial(-5);
    }

}

