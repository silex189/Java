package chapter3;


public class GuessALetter {

	public static void main(String[] args) 
			throws java.io.IOException {
		 

			char character, answer = 'k';
			System.out.println("I'm thinking of a letter between a and z.");
			System.out.println("Can you guess it: ");

			character = (char) System.in.read();

			if (character == answer) System.out.println("**Right**");
			else {
				System.out.println("... Sorry, you are ");
				if(character < answer) System.out.println("too low");
				else System.out.println("too high");
			}
		

	}

}
