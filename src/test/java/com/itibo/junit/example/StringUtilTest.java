package com.itibo.junit.example;

import org.apache.log4j.Logger;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by vlad on 28.04.16.
 */
public class StringUtilTest {
    private final static Logger logger = Logger.getLogger(StringUtilTest.class);

    private static StringUtil stringUtil;

    @BeforeClass
    public static void setUp(){
        logger.info("********* SETTING UP *********");
        stringUtil = new StringUtil();
        logger.info("********* SETTING UP SUCCESSFUL *********");
    }

    @Test
    public void concatTest(){
        logger.info("********* CONCAT TEST *********");
        assertEquals("vlad", stringUtil.concat("vl", "ad"));
    }

    @Test
    public void deleteCharTest(){
        logger.info("********* DELETE CHAR TEST *********");
        assertEquals("vad", stringUtil.deleteChar("vlad", 1));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void deleteCharIllegalArgTest(){
        logger.info("********* DELETE CHAR ILLEGAL ARGS TEST *********");
        assertEquals("vad", stringUtil.deleteChar("vlad", 4));
    }

    @Test(expected = NullPointerException.class)
    public void deleteCharNullTest(){
        logger.info("********* DELETE CHAR NULL POINTER TEST *********");
        assertEquals("vad", stringUtil.deleteChar(null,1));
    }

    @AfterClass
    public static void down(){
        logger.info("********* SETTING DOWN *********");
        stringUtil = null;
        logger.info("********* SETTING DOWN SUCCESSFUL *********");
    }
}
