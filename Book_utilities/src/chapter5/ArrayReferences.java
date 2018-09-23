package chapter5;

public class ArrayReferences {

	public static void main(String[] args) {
		
		int i;

		int numbers1[] = new int[10];
		int numbers2[] = new int[10];

		for(i = 0; i < 10; i++)
			numbers1[i] = i;

		for(i = 0; i < 10; i++)
			numbers2[i] = -i; // casting to negative

		System.out.print("Here is numbers1: ");
		for(i = 0; i < 10; i++)
			System.out.print(numbers1[i] + " ");
		
		System.out.println();

		System.out.print("Here is numbers2: ");
		for(i = 0; i < 10; i++)
			System.out.print(numbers2[i] + " ");

		System.out.println();
		numbers2 = numbers1;

		System.out.print("Here is numbers2 after assignment: ");
		for(i = 0; i < 10; i++)
			System.out.print(numbers2[i] + " ");

		System.out.println();
		numbers2[3] = 99;

		System.out.print("Here is numbers1 after change through numebers2: ");
		for(i = 0; i < 10; i++)
			System.out.print(numbers1[i] + " ");


	}

}
