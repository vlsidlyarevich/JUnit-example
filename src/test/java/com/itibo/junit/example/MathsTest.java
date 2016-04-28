package com.itibo.junit.example;

import org.junit.*;
import static org.junit.Assert.*;

public class MathsTest {

    private Maths maths;

    @Before
    public void setUp(){
        System.out.println("\n********** SETTING UP **********");
        maths = new Maths();
        System.out.println("\n********** SETTING UP SUCCESSFUL **********");
    }

    @After
    public void down(){
        System.out.println("\n********** SETTING DOWN **********");
        maths = null;
        System.out.println("\n********** SETTING DOWN SUCCESSFUL **********");
    }

    @Test
    public void sumTest(){
        System.out.println("\n********** SUM TEST **********");
        assertEquals(maths.sum(2,2),4);
    }

    @Test
    public void multiplyTest(){
        System.out.println("\n********** MULTIPLY TEST **********");
        assertTrue(maths.multiply(3,2) == 6);
    }

    @Test
    public void residueTest(){
        System.out.println("\n********** RESIDUE TEST **********");
        assertEquals(maths.residue(2,4),2);
    }

    @Test
    public void factorialTest(){
        System.out.println("\n********** FACTORIAL TEST **********");
        assertEquals(maths.factorial(2),2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void factorialNegativeNumberTest(){
        System.out.println("\n********** FACTORIAL WITH NEGATIVE TEST **********");
        maths.factorial(-5);
    }

}
