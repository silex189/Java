package chapter6;

class Overload {

	public void OverloadDemo() {
		System.out.println("No parameters");
	}


	public void OverloadDemo(int i) {
		System.out.println("One parameter: " + i);
	}

	public int OverloadDemo(int i, int j) {
		System.out.println("Two parameters: " + i + " " + j);
		return i + j;
	}

	public double OverloadDemo(double i, double j) {
		System.out.println("Two parameters : " + i + " " + j);
		return i + j;
	}

	public void OverloadDemo(byte b) {
		System.out.println("One parameter byte: " + b);
	}
	
	public void OverloadDemo(double d) {
		System.out.println("One parameter double: " + d);
	}
	
	public void OverloadDemo(int i, double d) {
		System.out.println("Two parameters, int and double: " + i + " " + d);
	}
	

}

public class OverLoadDemo {

	public static void main(String args[]) {
		Overload overload = new Overload();
		int restInteger;
		double restDouble;

		overload.OverloadDemo();
		System.out.println();

		overload.OverloadDemo(2);
		System.out.println();

		restInteger = overload.OverloadDemo(4, 6);
		System.out.println("Result of overload.overloadDemo(4, 6): " + restInteger);
		System.out.println();

		restDouble = overload.OverloadDemo(1.1, 2.32);
		System.out.println("Result of overload.overloadDemo(1.1, 2.32): " + restDouble);
		System.out.println();
		
		overload.OverloadDemo((byte) 8);
		System.out.println();
		
		overload.OverloadDemo(12.12);
		System.out.println();
		
		overload.OverloadDemo(90, 64.8);
		System.out.println();
	}

}
