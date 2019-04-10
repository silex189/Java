package chapter06_Methods_And_Classes_In_Deep;

class OverloadConstructor {

	private int i;

	OverloadConstructor() {
		System.out.println("Inside Default OverloadConstructor().");
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

	int geti() {
		return i;
	}
}

public class OverloadConstructorsDemo {
	public static void main(String[] args) {
		
		OverloadConstructor overloadConstructor = new OverloadConstructor();
		System.out.println("i = " + overloadConstructor.geti() + "\n");

		overloadConstructor = new OverloadConstructor(88);
		System.out.println("i = " + overloadConstructor.geti() + "\n");

		overloadConstructor = new OverloadConstructor(17.23);
		System.out.println("i = " + Double.parseDouble((overloadConstructor.geti()) + "") + "\n");
		
		overloadConstructor = new OverloadConstructor(2, 4);
		System.out.println("i = " + overloadConstructor.geti());
	}

}
