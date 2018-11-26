package chapter14_Lambdas;

interface NumericFunction {
	int function(int number);
}

public class BlockLambdaDemo {

	public static void main(String[] args) {

		NumericFunction smallestFactor = (number) -> {
			int result = 1;

			number = number < 0 ? -number : number;

			for (int i = 2; i <= number / i; i++)
				if ((number % i) == 0) {
					result = i;
					break;
				}

			return result;
		};

		System.out.println("Smallest factor of 12 is " + smallestFactor.function(12));
		System.out.println("Smallest factor of 11 is " + smallestFactor.function(11));

	}

}
