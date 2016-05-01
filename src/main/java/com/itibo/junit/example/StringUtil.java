package com.itibo.junit.example;

/**
 * Created by vlad on 28.04.16.
 */
public class StringUtil {
    public String concat(String str1,String str2){
        return str1+str2;
    }

    public String deleteChar(String str,int pos){
        if(str == null) {
            throw new NullPointerException();
        } else if(pos > str.length()) {
            throw new StringIndexOutOfBoundsException();
        } else {
            return str.substring(0, pos) + str.substring(pos + 1);
        }
    }
}