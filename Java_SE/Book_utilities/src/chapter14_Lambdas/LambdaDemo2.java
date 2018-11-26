package chapter14_Lambdas;

interface NumericTest {
	boolean test(int numerator, int denominator);
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		NumericTest isFactor = (n, d) -> (n % d) == 0;
		
		if (isFactor.test(10,  2))
			System.out.println("2 is a factor of 10");
		
		if (isFactor.test(10,  3))
			System.out.println("3 is not a factor of 10");
		
		System.out.println();
		NumericTest lessThan = (n, d) -> (n < d);
		
		if (lessThan.test(2, 10))
			System.out.println("2 is less than 10");
		
		if (!lessThan.test(10, 2))
			System.out.println("10 is not less than 2");
		
		System.out.println();
		NumericTest absoluteEqual = (n, d) -> (n < 0 ? -n : n) == (d < 0 ? -d : d);
		
		if (absoluteEqual.test(4,  -4))
			System.out.println("Absolute values of 4 and -4 are equal.");
		
		if (!absoluteEqual.test(4, -5))
			System.out.println("Absolute value of 4 and -5 are not equal.");
		
		System.out.println();
	}

}
