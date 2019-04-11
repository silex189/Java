package chapter09_Exceptions;

public class ThorwsDemo {
	public static char prompt(String string) throws java.io.IOException {

		System.out.println(string + ": ");
		return (char) System.in.read();
	}

	public static void main(String[] args) {
		char ch;

		try {
			ch = prompt("Enter a letter");
		} catch (java.io.IOException exception) {
			System.out.println("I/O exception occured.");
			ch = 'X';
		}
		System.out.println("You pressed " + ch);

	}
}
