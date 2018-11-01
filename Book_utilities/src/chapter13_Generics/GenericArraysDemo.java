package chapter13_Generics;

class GenericArrays<T extends Number> {
	T object;
	T values[];
	
	GenericArrays(T object, T[] nums) {
		this.object = object;
//		values = new T[10];
		values = nums;
	}
}

public class GenericArraysDemo {

	public static void main(String[] args) {
		Integer numbers[] = { 1, 2, 3, 4, 5 };
		
		GenericArrays<Integer> genericArrays = new GenericArrays<Integer>(50, numbers);
		
		
//		GenericArrays<Integer> gens[] = new GenericArrays<Integer>[10];
		GenericArrays<?> gens[] = new GenericArrays<?>[10];

	}

}
