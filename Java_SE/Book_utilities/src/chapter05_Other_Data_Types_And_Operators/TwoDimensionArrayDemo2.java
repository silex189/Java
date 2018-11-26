package chapter05_Other_Data_Types_And_Operators;

public class TwoDimensionArrayDemo2 {

	public static void main(String[] args) {
		
		int squares[][] = {
			{ 1, 1 },
			{ 3, 9 },
			{ 4, 16 },
			{ 5, 25 },
			{ 6, 36 },
			{ 7, 49 },
			{ 8, 64 },
			{ 9, 81 },
			{ 10, 100 },
		};

		for(int i = 0; i < squares.length; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(squares[i][j] + " ");
			}
			System.out.println();
		}

	}

}
