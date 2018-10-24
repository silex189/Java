package chapter6_Methods_And_Classes_In_Deep;

class MyClass {
	
	private int alpha;
	public int beta;
	int gamma;

	void setAlpha(int alpha) {
		this.alpha = alpha;
	}

	int getAlpha() {
		return alpha;
	}
}

public class AccessDemo {

	public static void main(String[] args) {
		
		MyClass myClass = new MyClass();

		myClass.setAlpha(-99);
		System.out.println("myClass.alpha is " + myClass.getAlpha());

		// myClass.alpha = 10; ERROR, PRIVATE

		myClass.beta = 88;
		myClass.gamma = 99;
	}
}
