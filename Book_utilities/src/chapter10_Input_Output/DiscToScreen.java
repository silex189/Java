package chapter10_Input_Output;

import java.io.*;

public class DiscToScreen {

	public static void main(String[] args) {
		String str;

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("testing_files/test.txt"))) {
			while ((str = bufferedReader.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException exception) {
			System.out.println("I/O Error: " + exception);
		}

	}

}
