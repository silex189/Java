package chapter8_Packages_Interfaces;

interface A {
	void method1();

	void method2();
}

interface B extends A {
	void method3();
}

class MyClass implements B {
	public void method1() {
		System.out.println("Implement method1().");
	}

	public void method2() {
		System.out.println("Implement method2().");
	}

	public void method3() {
		System.out.println("Implement method3().");
	}
}

public class IntefaceExtended {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();

		myClass.method1();
		myClass.method2();
		myClass.method3();

	}

}
