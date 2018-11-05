package chapter14_Lambdas;

import java.util.function.Predicate;

public class UsePredicateInterface {

	public static void main(String[] args) {
		Predicate<Integer> isEven = (n) -> (n % 2) == 0;
		
		if (isEven.test(4)) System.out.println("4 is even");
		
		if (!isEven.test(5)) System.out.println("5 is odd");

	}

}
