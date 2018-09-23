package chapter5;

public class ArrayMinMax {

	public static void main(String[] args) {
		
		int numbers[] = { 99, -10, 1000123, 18, -978, 5623, 463, -9, 287, 49 };
		int min, max;

		min = max = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < min) min = numbers[i];
			if(numbers[i] > max) max = numbers[i];
		}

		System.out.println("Minimum and maximum: " + min + " " + max);

	}

}
