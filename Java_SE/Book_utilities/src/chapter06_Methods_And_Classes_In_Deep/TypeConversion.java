package chapter06_Methods_And_Classes_In_Deep;

class Overload2 {
	
	void function(byte b) {
		System.out.println("Inside function(byte): " + b);
	}
	
	void function(int i) {
		System.out.println("Inside function(int): " + i);
	}

	void function(double d) {
		System.out.println("Inside function(double): " + d);
	}
	
}

public class TypeConversion {
	public static void main(String[] args) {
		
		Overload2 overload2 = new Overload2();
		int i = 10;
		double d = 10.1;

		byte b = 99;
		short s = 10;
		float f = 11.5F;

		overload2.function(i);
		overload2.function(d);
		
		overload2.function(b);
		overload2.function(s);
		overload2.function(f);

	}
}
