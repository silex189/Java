package chapter14_Lambdas;

@FunctionalInterface
interface SomeTest<T> {
	boolean test(T object1, T object2);
}

public class GenericFunctionalInterface {

	public static void main(String[] args) {

		SomeTest<Integer> isFactor = 
				(numerator, denominator) -> (numerator % denominator) == 0;
		
		if (isFactor.test(10, 2))
			System.out.println("2 is a factor of 10");
		
		System.out.println();
				
		SomeTest<Double> isFactorDouble =
				(numerator, denominator) -> (numerator % denominator) == 0;
			
		if (isFactorDouble.test(212.0, 4.0))
			System.out.println("4.0 is a factor of 212.0");
		System.out.println();
		
		SomeTest<String> isIn = (number1, number2) -> number1.indexOf(number2) != -1;
		String string = "Generic Functional Interface";
		System.out.println("Testing string: " + string);
		
		if (isIn.test(string, "face"))
			System.out.println("'face' is found.");
		else
			System.out.println("'face' not found.");
				
	}

}
