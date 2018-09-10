package chapter3;


public class GuessALetter {

	public static void main(String[] args) 
			throws java.io.IOException {

			char character, ignore, answer = 'k';
		 

			do {
					System.out.println("I'm thinking of a letter between a and z.");
					System.out.println("Can you guess it: ");

					character = (char) System.in.read();
					do {
						ignore = (char) System.in.read();
					} while (ignore != '\n');

					if (character == answer) System.out.println("**Right**");
					else {
						System.out.println("... Sorry, you are ");
						if(character < answer) System.out.println("too low");
						else System.out.println("too high");
					}
			} while (answer != character);
			
		

	}

}
