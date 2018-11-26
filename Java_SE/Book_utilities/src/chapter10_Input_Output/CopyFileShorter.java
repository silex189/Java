package chapter10_Input_Output;

import java.io.*;

public class CopyFileShorter {

	public static void main(String[] args) {
		int input;

		if (args.length != 2) {
			System.out.println("Usage: CopyFile from to");
			return;
		}

		try (FileInputStream fileInputStream = new FileInputStream(args[0]);
				FileOutputStream fileOutputStream = new FileOutputStream(args[1])) {

			do {
				input = fileInputStream.read();
				if (input != -1)
					fileOutputStream.write(input);

			} while (input != -1);
		} catch (IOException exception) {
			System.out.println("I/O Error: " + exception);
		}

	}

}
