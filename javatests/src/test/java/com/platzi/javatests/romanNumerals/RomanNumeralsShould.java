package com.platzi.javatests.romanNumerals;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RomanNumeralsShould {

    @Test
    public void arabic_numeral_1_is_equal_to_I_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(1), is("I"));
    }

    @Test
    public void arabic_numeral_2_is_equal_to_II_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(2), is("II"));
    }

    @Test
    public void arabic_numeral_3_is_equal_to_III_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(3), is("III"));
    }

    @Test
    public void arabic_numeral_5_is_equal_to_V_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(5), is("V"));
    }

    @Test
    public void arabic_numeral_6_is_equal_to_VI_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(6), is("VI"));
    }

    @Test
    public void arabic_numeral_7_is_equal_to_VII_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(7), is("VII"));
    }

    @Test
    public void arabic_numeral_10_is_equal_to_X_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(10), is("X"));
    }

    @Test
    public void arabic_numeral_11_is_equal_to_XI_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(11), is("XI"));
    }

    @Test
    public void arabic_numeral_15_is_equal_to_XV_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(15), is("XV"));
    }

    @Test
    public void arabic_numeral_16_is_equal_to_XVI_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(16), is("XVI"));
    }

    @Test
    public void arabic_numeral_20_is_equal_to_XX_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(20), is("XX"));
    }

    @Test
    public void arabic_numeral_50_is_equal_to_L_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(50), is("L"));
    }

    @Test
    public void arabic_numeral_51_is_equal_to_LI_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(51), is("LI"));
    }

    @Test
    public void arabic_numeral_55_is_equal_to_LV_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(55), is("LV"));
    }

    @Test
    public void arabic_numeral_56_is_equal_to_LVI_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(56), is("LVI"));
    }

    @Test
    public void arabic_numeral_60_is_equal_to_LX_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(60), is("LX"));
    }

    @Test
    public void arabic_numeral_70_is_equal_to_LXX_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(70), is("LXX"));
    }

    @Test
    public void arabic_numeral_80_is_equal_to_LXXX_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(80), is("LXXX"));
    }

    @Test
    public void arabic_numeral_81_is_equal_to_LXXXI_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(81), is("LXXXI"));
    }

    @Test
    public void arabic_numeral_85_is_equal_to_LXXXV_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(85), is("LXXXV"));
    }




}