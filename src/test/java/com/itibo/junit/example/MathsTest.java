package com.itibo.junit.example;

import org.junit.*;
import static org.junit.Assert.*;

public class MathsTest {

    private Maths maths;

    @Before
    public void setUp(){

        maths = new Maths();
    }

    @After
    public void down(){

        maths = null;
    }

    @Test
    public void sumTest(){

        assertEquals(maths.sum(2,2),4);

    }

    @Test
    public void multiplyTest(){

        assertTrue(maths.multiply(3,2) == 6);

    }

    @Test
    public void residueTest(){

        assertEquals(maths.residue(2,4),2);

    }

    @Test
    public void factorialTest(){

        assertEquals(maths.factorial(2),2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void factorialNegativeNumberTest(){

        maths.factorial(-5);
    }

}
