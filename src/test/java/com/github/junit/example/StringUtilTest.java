package com.github.junit.example;

import org.apache.log4j.Logger;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by vlad on 28.04.16.
 */
public class StringUtilTest {
    private final static Logger LOGGER = Logger.getLogger(StringUtilTest.class);

    private static StringUtil stringUtil;

    @BeforeClass
    public static void setUp(){
        LOGGER.info("********* SETTING UP *********");
        stringUtil = new StringUtil();
        LOGGER.info("********* SETTING UP SUCCESSFUL *********");
    }

    @AfterClass
    public static void down(){
        LOGGER.info("********* SETTING DOWN *********");
        stringUtil = null;
        LOGGER.info("********* SETTING DOWN SUCCESSFUL *********");
    }

    @Test
    public void concatTest(){
        LOGGER.info("********* CONCAT TEST *********");
        assertEquals("vlad", stringUtil.concat("vl", "ad"));
    }

    @Test
    public void deleteCharTest(){
        LOGGER.info("********* DELETE CHAR TEST *********");
        assertEquals("vad", stringUtil.deleteChar("vlad", 1));
    }

    @Test(expected = RuntimeException.class)
    public void deleteCharIllegalArgTest(){
        LOGGER.info("********* DELETE CHAR ILLEGAL ARGS TEST *********");
        stringUtil.deleteChar("vlad", 4);
    }

    @Test(expected = RuntimeException.class)
    public void deleteCharNullTest(){
        LOGGER.info("********* DELETE CHAR NULL POINTER TEST *********");
        stringUtil.deleteChar(null,1);
    }

}

