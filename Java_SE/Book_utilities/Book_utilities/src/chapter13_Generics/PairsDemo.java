package chapter13_Generics;

class Pair<T, V extends T> {
	T first;
	V second;
	
	Pair(T first, V second) {
		this.first = first;
		this.second = second;
	}
}

public class PairsDemo {

	public static void main(String[] args) {
		Pair<Integer, Integer> integerPair =
				new Pair<Integer, Integer>(1, 2);
		
		Pair<Number, Integer> numberPair =
				new Pair<Number, Integer>(10.4, 12);

	}

}
