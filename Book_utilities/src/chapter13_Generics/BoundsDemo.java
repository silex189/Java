package chapter13_Generics;

public class BoundsDemo {

	public static void main(String[] args) {
		NumericFunctions<Integer> numericFunctions1 =
				new NumericFunctions<Integer>(5);
		
		System.out.println("Reciprocal of numericFunctions is " + numericFunctions1.reciprocal());
		System.out.println("Fractional component of numericFunctions is " + numericFunctions1.fraction());
		
		System.out.println();
		
		NumericFunctions<Double> numericFunctions2 = 
				new NumericFunctions<Double>(5.25);
		
		System.out.println("Reciprocal of numericFunctions is " + numericFunctions2.reciprocal());
		System.out.println("Fractional component of numericFunctions is " + numericFunctions2.fraction());
		

	}

}
