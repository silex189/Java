package chapter05_Other_Data_Types_And_Operators;

public class ForEachArray {

	public static void main(String[] args) {
		
		int sum = 0;
		int twoDimensionArray[][] = new int[3][5];
		int threeDimensionArray[][][] = new int [3][5][6];

		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 5; j++)
				twoDimensionArray[i][j] = (i + 1) * (j + 1);

		for(int outerIterator[] : twoDimensionArray)
			for(int innerIterator : outerIterator) {
				System.out.println("Value is : " + innerIterator);
				sum += innerIterator;
			}

		System.out.println("\nSummation is " + sum);
		
		System.out.println();

		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 5; j++)
				for(int k = 0; k < 6; k++)
					threeDimensionArray[i][j][k] = ((i + 1) * (j + 1)) * (k + 1);

		for(int outerIterator[][] : threeDimensionArray)
			for(int middleIterator[]: outerIterator)
				for(int innerIterator : middleIterator)
					System.out.println("Value is: " + innerIterator);

	}

}
