package chapter13_Generics;

class Summation {
	private int sum;
	
	<T extends Number> Summation(T arg) {
		sum = 0;
		
		for (int i=0; i <= arg.intValue(); i++)
			sum += 1;
	}
	
	int getSum() {
		return sum;
	}
}

public class GenericConstructorDemo {

	public static void main(String[] args) {
		Summation summation = new Summation(4.0);
		System.out.println("Summation of 4.0 is " + summation.getSum());
		
		

	}

}
