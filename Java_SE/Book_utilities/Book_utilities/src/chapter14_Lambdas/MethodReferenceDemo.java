package chapter14_Lambdas;

class PredicatesClass {
	
	static boolean isPrime(int number) {
		if (number < 2) return false;
		
		for (int i=2; i <= number/i; i++) {
			if ((number % i) == 0)
				return false;
		}
		return true;
	}
	
	static boolean isEven(int number) {
		return (number % 2) == 0;
	}
	
	static boolean isPositive(int number) {
		return number > 0;
	}
	
	
}


public class MethodReferenceDemo {

	static boolean numberTest(PredicateInterface predicateInterface, int value) {
		return predicateInterface.test(value);
	}
	
	public static void main(String[] args) {
		
		boolean result;
		
		result = numberTest(PredicatesClass::isPrime, 17);
		if (result) System.out.println("17 is prime");
		
		result = numberTest(PredicatesClass::isEven, 12);
		if (result) System.out.println("12 is even");
		
		result = numberTest(PredicatesClass::isPositive, 11);
		if (result) System.out.println("11 is positive");
		
	}

}
