package chapter10_Input_Output;

import java.io.*;

public class ReadCharacters {

	public static void main(String[] args) throws IOException {
		char character;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter characters, period to quit");

		do {
			character = (char) bufferedReader.read();
			System.out.println(character);
		} while (character != '.');

	}

}
