package chapter13_Generics;

interface Contaiment<T> {
	boolean contains(T object);
}

class MyClass<T> implements Contaiment<T> {
	T[] array;

	MyClass(T[] array) {
		this.array = array;
	}

	@Override
	public boolean contains(T object) {
		for (T x : array)
			if (x.equals(object)) return true;
		return false;
	}
	
}

public class GenericInterfaceDemo {

	public static void main(String[] args) {
		Integer array[] = { 1, 2, 3 };
		
		MyClass<Integer> object = new MyClass<Integer>(array);
		
		if (object.contains(2))
			System.out.println("2 is in object");
		else
			System.out.println("2 is NOT in object");
		
		if (object.contains(5))
			System.out.println("5 is in object");
		else
			System.out.println("5 is NOT in object");
		
//		if (object.contains(9.25))
//			System.out.println("9.25 is in object");
		

	}

}
