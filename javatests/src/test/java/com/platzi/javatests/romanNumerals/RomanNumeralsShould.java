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
    public void arabic_numeral_4_is_equal_to_IV_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(4), is("IV"));
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
    public void arabic_numeral_9_is_equal_to_IX_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(9), is("IX"));
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
    public void arabic_numeral_14_is_equal_to_XIV_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(14), is("XIV"));
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
    public void arabic_numeral_19_is_equal_to_XIX_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(19), is("XIX"));
    }

    @Test
    public void arabic_numeral_20_is_equal_to_XX_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(20), is("XX"));
    }

    @Test
    public void arabic_numeral_24_is_equal_to_XXIV_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(24), is("XXIV"));
    }

    @Test
    public void arabic_numeral_40_is_equal_to_XL_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(40), is("XL"));
    }

    @Test
    public void arabic_numeral_49_is_equal_to_XLIX_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(49), is("XLIX"));
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

    @Test
    public void arabic_numeral_86_is_equal_to_LXXXVI_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(86), is("LXXXVI"));
    }

    @Test
    public void arabic_numeral_90_is_equal_to_XC_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(90), is("XC"));
    }

    @Test
    public void arabic_numeral_99_is_equal_to_XCIX_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(99), is("XCIX"));
    }

    @Test
    public void arabic_numeral_126_is_equal_to_CXXVI_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(126), is("CXXVI"));
    }

    @Test
    public void arabic_numeral_400_is_equal_to_CD_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(400), is("CD"));
    }

    @Test
    public void arabic_numeral_900_is_equal_to_CM_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(900), is("CM"));
    }

    @Test
    public void arabic_numeral_2507_is_equal_to_MMDVII_in_roman_numerals() {

        RomanNumerals romanNumerals = new RomanNumerals();
        assertThat(romanNumerals.arabicToRoman(2507), is("MMDVII"));
    }

}