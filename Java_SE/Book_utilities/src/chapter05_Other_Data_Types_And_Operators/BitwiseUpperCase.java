package chapter05_Other_Data_Types_And_Operators;

public class BitwiseUpperCase {

	public static void main(String[] args) {
		
		char character;

		for(int i = 0; i < 10; i++) {
			character = (char) ('a' + i);
			System.out.print(character);

			character = (char) ((int) character & 65503);
			System.out.print(character + " ");


		}

	}

}
