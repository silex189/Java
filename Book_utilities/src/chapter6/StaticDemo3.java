package chapter6;

class StaticBlock {
	
	static double rootOf2;
	private static double rootOf3;

	static {
		System.out.println("Inside static block.");
		rootOf2 = Math.sqrt(2.0);
		rootOf3 = Math.sqrt(3.0);
	}

	StaticBlock(String message) {
		System.out.println(message);
	}
	
	static double getRootOf3() {
		return rootOf3;
	}
}

public class StaticDemo3 {

	public static void main(String[] args) {
		StaticBlock staticBlock = new StaticBlock("Inside constructor");

		System.out.println("Square root of 2 is " + StaticBlock.rootOf2);
		System.out.println("Square root of 3 is " + StaticBlock.getRootOf3());

	}

}
