package chapter13_Generics;

class Generic<T> {
	T object;
	
	Generic(T object) {
		this.object = object;
	}
	
	T getObject() {
		return object;
	}
	
	void showType() {
		System.out.println("Type of T is " + object.getClass().getName());
	}
	
}


public class GenericsDemo {

	public static void main(String[] args) {
		Generic<Integer> integerGeneric;
		integerGeneric = new Generic<Integer>(88);
		
		integerGeneric.showType();
		
		int value = integerGeneric.getObject();
		System.out.println("value: " + value);
		
		System.out.println();
		
		Generic<String> stringGeneric = new Generic<String>("Generic Test");
		stringGeneric.showType();
		
		String string = stringGeneric.getObject();
		System.out.println("value: " + string);
		
		

	}

}
