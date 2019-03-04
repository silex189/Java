package com.platzi.javatests.fizzBuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzShould {

    @Test
    public void return_Fizz_for_3_divided_by_3() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(3), is("Fizz"));
    }

    @Test
    public void return_Fizz_for_6_divided_by_3() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(6), is("Fizz"));
    }

    @Test
    public void return_Buzz_for_5_divided_by_5() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(5), is("Buzz"));
    }

    @Test
    public void return_Buzz_for_10_divided_by_5() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(10), is("Buzz"));
    }

    @Test
    public void return_Buzz_for_15_divided_by_3_and_5() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(15), is("FizzBuzz"));
    }

    @Test
    public void return_Buzz_for_30_divided_by_3_and_5() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(30), is("FizzBuzz"));
    }

    @Test
    public void return_2_for_2() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(2), is("2"));
    }
    @Test
    public void return_16_for_16() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(16), is("16"));
    }
}