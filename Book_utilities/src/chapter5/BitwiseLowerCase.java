package chapter5;

public class BitwiseLowerCase {

	public static void main(String[] args) {
		
		char character;

		for(int i = 0; i < 10; i++){
			character = (char) ('A' + i);
			System.out.print(character);

			character = (char) ((int) character | 32);
			System.out.print(character + " ");
		}

	}

}
