package chapter03_Control_Instructions;

public class AlphabetPrinting {
	public static void main(String[] args) {
		
		char character = 'a';

		while(character != 'z') {
			System.out.print(character + " ");
			character++;
		}
	}
}
