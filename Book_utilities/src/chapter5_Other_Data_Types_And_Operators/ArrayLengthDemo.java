package chapter5_Other_Data_Types_And_Operators;

public class ArrayLengthDemo {

	public static void main(String[] args) {
		
		int list[] = new int[10];
		int numbers[] = { 1, 2, 3 };
		int table[][] = {
			{1, 2, 3},
			{4, 5},
			{6, 7, 8}
		};

		System.out.println("length of list is " + list.length);
		System.out.println("length of numbers is " + numbers.length);
		System.out.println("length of table is " + table.length);
		System.out.println("length of table[0] is " + table[0].length);
		System.out.println("length of table[1] is " + table[1].length);
		System.out.println("length of table[2] is " + table[2].length);
		System.out.println("");
		
		for(int i = 0; i < list.length; i++)
			list[i] = i * 1;

		System.out.print("Here is list: ");
		for(int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");

	}

}
