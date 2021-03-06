package chapter05_Other_Data_Types_And_Operators;

import java.util.Arrays;

public class ArraySearching {
	public static void main(String[] args) {
		
		int numbers[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
		int value = 5;
		boolean found = false;

		for(int iterador : numbers) {
			if(iterador == value) {
				found = true;
				break;
			}
		}

		if(found == true)
			System.out.println("Value found");
		
		Arrays.sort(numbers);
		if(value == numbers[Arrays.binarySearch(numbers, value)])  // must be sorted
			System.out.println("Value re-found");
	}
}
