package com.itibo.junit.example;

import org.apache.log4j.Logger;
import org.junit.*;
import static org.junit.Assert.*;

public class MathUtilTest {
    private final static Logger logger = Logger.getLogger(MathUtilTest.class);

    private MathUtil mathUtil;

    @Before
    public void setUp(){
        logger.info("********* SETTING UP *********");
        mathUtil = new MathUtil();
        logger.info("********* SETTING UP SUCCESSFUL *********");
    }

    @Test
    public void sumTest(){
        logger.info("********* SUM TEST *********");
        assertEquals(mathUtil.sum(2,2),4);
    }

    @Test
    public void multiplyTest(){
        logger.info("********* MULTIPLY TEST *********");
        assertTrue(mathUtil.multiply(3,2) == 6);
    }

    @Test
    public void residueTest(){
        logger.info("********* RESIDUE TEST *********");
        assertEquals(mathUtil.residue(2,4),2);
    }

    @Test
    public void factorialTest(){
        logger.info("********* FACTORIAL TEST *********");
        assertEquals(mathUtil.factorial(2),2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void factorialNegativeNumberTest(){
        logger.info("********* FACTORIAL WITH NEGATIVE TEST *********");
        mathUtil.factorial(-5);
    }

    @After
    public void down(){
        logger.info("********* SETTING DOWN *********");
        mathUtil = null;
        logger.info("********* SETTING DOWN SUCCESSFUL *********");
    }
}
