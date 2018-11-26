package chapter13_Generics;

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
