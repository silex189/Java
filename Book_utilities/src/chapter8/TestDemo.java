package chapter8;

class Test {
	private int putLocker = 0;
	
	void myMethod() {
		System.out.println("Inside and before " + putLocker);
		putLocker++;
		System.out.println("Inside and After " + putLocker);
	}
	
	int result() {
		return putLocker;
	}
}

public class TestDemo {

	public static void main(String[] args) {
		Test test = new Test();
		test.myMethod();
		System.out.println("after myMethod " + test.result());

	}

}
