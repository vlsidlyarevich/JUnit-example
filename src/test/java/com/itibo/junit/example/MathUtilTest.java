package com.itibo.junit.example;

import org.junit.*;
import static org.junit.Assert.*;

public class MathUtilTest {

    private MathUtil mathUtil;

    @Before
    public void setUp(){
        System.out.println("\n********** SETTING UP **********");
        mathUtil = new MathUtil();
        System.out.println("\n********** SETTING UP SUCCESSFUL **********");
    }

    @Test
    public void sumTest(){
        System.out.println("\n********** SUM TEST **********");
        assertEquals(mathUtil.sum(2,2),4);
    }

    @Test
    public void multiplyTest(){
        System.out.println("\n********** MULTIPLY TEST **********");
        assertTrue(mathUtil.multiply(3,2) == 6);
    }

    @Test
    public void residueTest(){
        System.out.println("\n********** RESIDUE TEST **********");
        assertEquals(mathUtil.residue(2,4),2);
    }

    @Test
    public void factorialTest(){
        System.out.println("\n********** FACTORIAL TEST **********");
        assertEquals(mathUtil.factorial(2),2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void factorialNegativeNumberTest(){
        System.out.println("\n********** FACTORIAL WITH NEGATIVE TEST **********");
        mathUtil.factorial(-5);
    }

    @After
    public void down(){
        System.out.println("\n********** SETTING DOWN **********");
        mathUtil = null;
        System.out.println("\n********** SETTING DOWN SUCCESSFUL **********");
    }
}
