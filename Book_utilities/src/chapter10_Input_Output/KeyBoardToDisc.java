package chapter10_Input_Output;

import java.io.*;

public class KeyBoardToDisc {

	public static void main(String[] args) {
		String str;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter text ('stop' to quit)).");

		try (FileWriter fileWriter = new FileWriter("testing_files/test.txt")) {

			do {
				System.out.print(": ");
				str = bufferedReader.readLine();

				if (str.compareTo("stop") == 0)
					break;
				str = str + "\r\n";
				fileWriter.write(str);
			} while (str.compareTo("stop") != 0);
		} catch (IOException exception) {
			System.out.println("I/O Error: " + exception);
		}

	}

}
