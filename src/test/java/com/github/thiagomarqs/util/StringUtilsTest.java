package com.github.thiagomarqs.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void shouldReverseString() {
        String s = "Hello world!";
        String reversed = StringUtils.reverse(s);
        assertEquals("!dlrow olleH", reversed);
    }

    @Test
    void shouldReturnEmptyStringWhenArgumentIsNull() {
        String reversed = StringUtils.reverse(null);
        assertEquals("", reversed);
    }

}