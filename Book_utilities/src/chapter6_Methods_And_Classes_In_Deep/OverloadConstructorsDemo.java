package chapter6_Methods_And_Classes_In_Deep;

class OverloadConstructor {

	private int i;

	OverloadConstructor() {
		System.out.println("Inside OverloadConstructor().");
		i = 0;
	}

	OverloadConstructor(int i) {
		System.out.println("Inside OverloadConstructor(int).");
		this.i = i;
	}

	OverloadConstructor(double d) {
		System.out.println("Inside OverloadConstructor(double).");
		this.i = (int) d;
	}

	OverloadConstructor(int i, int j) {
		System.out.println("Inside OverloadConstructo(int, int).");
		this.i = i * j;
	}

	public int geti() {
		return i;
	}
}

public class OverloadConstructorsDemo {

	public static void main(String[] args) {
		OverloadConstructor overloadConstructor1 = new OverloadConstructor();
		System.out.println("overloadConstructor1.i = " + overloadConstructor1.geti() + "\n");

		OverloadConstructor overloadConstructor2 = new OverloadConstructor(88);
		System.out.println("overloadConstructor2.i = " + overloadConstructor2.geti() + "\n");

		OverloadConstructor overloadConstructor3 = new OverloadConstructor(17.23);
		System.out.println("overloadConstructor3.i = " + overloadConstructor3.geti() + "\n");
		
		OverloadConstructor overloadConstructor4 = new OverloadConstructor(2, 4);
		System.out.println("overloadConstructor4.i = " + overloadConstructor4.geti());
	}

}
