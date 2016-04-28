package com.itibo.junit.example;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by vlad on 28.04.16.
 */
public class StringsTest {

    public static Strings strings;


    @BeforeClass
    public static void setUp(){
        System.out.println("\n********** SETTING UP **********");
        strings = new Strings();
        System.out.println("\n********** SETTING UP SUCCESSFUL **********");
    }

    @AfterClass
    public static void down(){
        System.out.println("\n********** SETTING DOWN **********");
        strings = null;
        System.out.println("\n********** SETTING DOWN SUCCESSFUL **********");
    }

    @Test
    public void concatTest(){
        System.out.println("\n********** CONCAT TEST **********");
        assertEquals(strings.concat("vl","ad"),"vlad");
    }

    @Test
    public void deleteCharTest(){
        System.out.println("\n********** DELETE CHAR TEST **********");
        assertEquals(strings.deleteChar("vlad",1),"vad");
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void deleteCharIllegalArgTest(){
        System.out.println("\n********** DELETE CHAR ILLEGAL ARGS TEST **********");
        assertEquals(strings.deleteChar("vlad",4),"vad");
    }

    @Test(expected = NullPointerException.class)
    public void deleteCharNullTest(){
        System.out.println("\n********** DELETE CHAR NULL POINTER TEST **********");
        assertEquals(strings.deleteChar(null,1),"vad");
    }
}
