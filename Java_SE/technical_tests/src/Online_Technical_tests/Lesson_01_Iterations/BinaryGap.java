package Online_Technical_tests.Lesson_01_Iterations;

import java.util.stream.Stream;

public class BinaryGap {
	static int calculateBinaryGap(int N) {
	    return Stream
	        .of(
	            Integer.toBinaryString(N) // integer to binary string
	            	.replaceAll("0+$", "") // trim 0(s) at the end
	                .split("1+"))// split string with 1(s)
	        		.filter(a -> a != null) // lambda expressions: use filter to keep not null elements
			        // method references: convert string to integer by using the
			        // length of string
			        .map(String::length)
			        // method references: find the largest number in the stream by
			        // using integer comparator
			        .max(Integer::compare)
			        // return 0 if nothing matches after the process
			        .orElse(0);
	    }
}
