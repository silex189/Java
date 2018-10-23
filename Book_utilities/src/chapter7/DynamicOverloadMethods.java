package chapter7;

class SuperiorClass {
	void who() {
		System.out.println("who() in SuperiorClass");
	}
}

class SubClass1 extends SuperiorClass {
	void who() {
		System.out.println("who() in SubClass1");
	}
}

class SubClass2 extends SuperiorClass {
	void who() {
		System.out.println("who() in SubClass2");
	}
}

public class DynamicOverloadMethods {

	public static void main(String[] args) {
		SuperiorClass superiorClass = new SuperiorClass();
		SubClass1 subClass1 = new SubClass1();
		SubClass2 subClass2 = new SubClass2();

		SuperiorClass superiorReference;

		superiorReference = superiorClass;
		superiorReference.who();

		superiorReference = subClass1;
		superiorReference.who();

		superiorReference = subClass2;
		superiorReference.who();

	}

}
