package com.platzi.javatests.romanNumerals;

public class RomanNumerals {

/*public static String arabicToRoman(int n) {

        String result = "";

        while((n <= 3000) && (n >= 1000)) { result += "M"; n -= 1000; }
        while((n <= 300) && (n >= 100)) { result += "C"; n -= 100; }
        while((n <= 150) && (n >= 50)) { result += "L"; n -= 50; }
        while((n <= 36) && (n >= 10)) { result += "X"; n -= 10; }
        while((n <= 15) && (n >= 5)) { result += "V"; n -= 5; }
        while (n <= 3 && n != 0) { result += "I"; n -= 1; }


        return result;
    }
}*/

public static String arabicToRoman(int n){

        String number = "";

        while(n >= 1000) { number += "M"; n -= 1000; }
        if(n >= 900) { number +="CM"; n -= 900; }
        if(n>=900) {number += "CM"; n -= 900;}
        if(n>=500) {number += "D"; n -= 500;}
        if(n>=400) {number += "CD"; n -= 400;}
        while(n>=100){number += "C"; n -= 100;}
        if(n>=90){number += "XC"; n -= 90;}
        if(n>=50){number += "L"; n -= 50;}
        if(n>=40){number += "XL"; n -=40;}
        while(n>=10){number += "X"; n -= 10;}
        if(n>=9){number += "IX"; n -=9;}
        if(n>=5){number += "V"; n -=5;}
        if(n>=4){number += "IV"; n -=4;}
        while(n>=1){number += "I"; n -= 1;}

        return number;
    }
}