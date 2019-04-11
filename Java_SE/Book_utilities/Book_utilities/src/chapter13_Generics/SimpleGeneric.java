package chapter13_Generics;

class TwoGenerics<T, V> {
	T object1;
	V object2;
	
	TwoGenerics(T object1, V object2) {
		this.object1 = object1;
		this.object2 = object2;
	}
	
	void showTypes() {
		System.out.println("Type of T is " + object1.getClass().getName());
		System.out.println("Type of V is " + object2.getClass().getName());
	}
	
	T getObject1() {
		return object1;
	}
	
	V getObject2() {
		return object2;
	}
	
}

public class SimpleGeneric {

	public static void main(String[] args) {
		TwoGenerics<Integer, String> twoGenerics =
				new TwoGenerics<Integer, String>(88, "Genercis");
		
		twoGenerics.showTypes();
		
		int value = twoGenerics.getObject1();
		System.out.println("value: " + value);
		
		String string = twoGenerics.getObject2();
		System.out.println("value: " + string);

	}

}
