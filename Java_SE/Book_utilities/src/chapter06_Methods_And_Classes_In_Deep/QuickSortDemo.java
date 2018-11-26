package chapter06_Methods_And_Classes_In_Deep;

public class QuickSortDemo {

	public static void main(String[] args) {
		
		char charArray[] = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' };
		int i;

		System.out.println("Original char array: ");
		for(i=0; i < charArray.length; i++)
			System.out.print(charArray[i]);

			System.out.println();

			QuickSort.quickSort(charArray);

			System.out.println("Sorted char array: ");
			for(i=0; i < charArray.length; i++)
				System.out.print(charArray[i]);
				
			System.out.println("\n");

			int intArray[] = { 5, 8, 1, 0, 0, 9, 9, 7};
		
			System.out.println("Original int array: ");
			for(i=0; i < intArray.length; i++)
				System.out.print(intArray[i]);
			
			System.out.println();
			QuickSort.quickSort(intArray);

			System.out.println("Sorted int array: ");
			for(i=0; i < intArray.length; i++)
				System.out.print(intArray[i]);

	}

}
