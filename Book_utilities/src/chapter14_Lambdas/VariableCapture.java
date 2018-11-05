package chapter14_Lambdas;

@FunctionalInterface
interface MyInterface {
	int function(int n);
}

public class VariableCapture {

	public static void main(String[] args) {
		int number = 10;
		
		MyInterface myLambda = (n) -> {
			int value = number + n;
//			number++;
			return value;
		};
		
		System.out.println(myLambda.function(8));
		
//		number = 9;

	}

}
