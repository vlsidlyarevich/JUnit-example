package com.github.junit.example;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by vlad on 28.04.16.
 */
public class StringUtil {
    public String concat(String str1, String str2) {
        return str1 + str2;
    }

    public String deleteChar(String str, int pos) {

        if (StringUtils.isEmpty(str)) {
            throw new RuntimeException("string is null");
        }

        if (pos > str.length()) {
            throw new RuntimeException("String index out of bounds");
        }

        return str.substring(0, pos) + str.substring(pos + 1);
    }
}
