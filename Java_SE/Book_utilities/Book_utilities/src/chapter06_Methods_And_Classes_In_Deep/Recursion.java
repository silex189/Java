package chapter06_Methods_And_Classes_In_Deep;

class Factorial {

	int recursive(int number) {
		if(number==1) return 1;
		
		int result = recursive(number-1) * number;
		
		return result;
	}

	int manual(int number) {
		int times, result;
		result = 1;
		
		for(times=1; times <= number; times++) result *= times;
		
		return result;
	}
}

public class Recursion {
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		
		System.out.println("Factorials using recursive method.");
		System.out.println("Factorial of 3 is " +  factorial.recursive(3));
		System.out.println("Factorial of 4 is " +  factorial.recursive(4));
		System.out.println("Factorial of 5 is " +  factorial.recursive(5));
		System.out.println();
		
		System.out.println("Factorials using iterative method.");
		System.out.println("Factorial of 3 is " +  factorial.manual(3));
		System.out.println("Factorial of 4 is " +  factorial.manual(4));
		System.out.println("Factorial of 5 is " +  factorial.manual(5));
	}
}
