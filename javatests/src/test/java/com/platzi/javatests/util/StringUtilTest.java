package com.platzi.javatests.util;

import org.junit.Assert;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void word_is_not_empty() {
        assertFalse(StringUtil.isEmpty("Palabra"));
    }

    @Test
    public void quotationMarks_is_Empty() {
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void space_is_Empty() {
        String str = new String(" ");
        assertTrue(StringUtil.isEmpty(str));
    }

    @Test
    public void null_is_empty() {
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void repeat_string_once() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
            public void repeat_string_multiple_times() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("hola", -1);
    }
}
