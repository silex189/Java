package chapter5;

public class BubbleSort {

	public static void main(String[] args) {
		
		int array[] = { 99, -10, 1000123, 18, -978, 5623, 463, -9, 287, 49 };

		int arrayLeftSide, arrayRightSide, tmp;
		int arrayLength;

		arrayLength = array.length;

		System.out.println("Original array is:");
		
		for(int i = 0; i < arrayLength; i++)
			System.out.print(" " + array[i]);
		System.out.println();

		
		
		for(arrayLeftSide = 1; arrayLeftSide < arrayLength; arrayLeftSide++)
			for(arrayRightSide = arrayLength-1; arrayRightSide >= arrayLeftSide; arrayRightSide--){
				if(array[arrayRightSide-1] > array[arrayRightSide]) {
					tmp = array[arrayRightSide-1];
					array[arrayRightSide-1] = array[arrayRightSide];
					array[arrayRightSide] = tmp;
				}
			}

		
			System.out.println("Sorted array is:");
			for(int i=0; i < arrayLength; i++)
				System.out.print(" " + array[i]);
			
			System.out.println();
			
	}
}
