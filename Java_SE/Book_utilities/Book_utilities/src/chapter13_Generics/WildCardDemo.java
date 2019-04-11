package chapter13_Generics;

public class WildCardDemo {

	public static void main(String[] args) {
		NumericFunctions<Integer> integerNumericFunctions =
				new NumericFunctions<Integer>(6);
		
		NumericFunctions<Double> doubleNumericFunctions =
				new NumericFunctions<Double>(-6.0);
		
		NumericFunctions<Long> longNumericFunctions =
				new NumericFunctions<Long>(5L);
		
		System.out.println("Testing integerNumericFunctions and doubleNumericFunctions.");
		if (integerNumericFunctions.absolutesEqual(doubleNumericFunctions)) 
			System.out.println("Absolute values are equal.");
		else
			System.out.println("Absolute values differ.");
		
		System.out.println();
		
		System.out.println("Testing integerNumericFunctions and longNumericFunctions");
		
		if (integerNumericFunctions.absolutesEqual(longNumericFunctions))
			System.out.println("Absolute values are equal.");
		else
			System.out.println("Absolute values differ.");

	}

}
