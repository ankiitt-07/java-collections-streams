package com.testing;

import com.testing.string_utils.StringUtils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    @Test
    void testReverse() {
        assertEquals("hello there", StringUtils.reverse("ereht olleh"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
    }
}
