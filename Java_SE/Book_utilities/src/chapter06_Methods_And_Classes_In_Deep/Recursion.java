package chapter06_Methods_And_Classes_In_Deep;

class Factorial {

	int factorialRecursive(int n) {
		int result;

		if(n==1) return 1;
		result = factorialRecursive(n-1) * n;
		return result;
	}

	int factorialIterative(int n) {
		int t, result;

		result = 1;
		for(t=1; t <= n; t++) result *= t;
		return result;
	}
}

public class Recursion {

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		
		System.out.println("Factorials using recursive method.");
		System.out.println("Factorial of 3 is " +  factorial.factorialRecursive(3));
		System.out.println("Factorial of 4 is " +  factorial.factorialRecursive(4));
		System.out.println("Factorial of 5 is " +  factorial.factorialRecursive(5));
		System.out.println();
		
		System.out.println("Factorials using iterative method.");
		System.out.println("Factorial of 3 is " +  factorial.factorialIterative(3));
		System.out.println("Factorial of 4 is " +  factorial.factorialIterative(4));
		System.out.println("Factorial of 5 is " +  factorial.factorialIterative(5));
	}
}
