package chapter10_Input_Output;

import java.io.*;

public class CopyFile {

	public static void main(String[] args) {
		int input;
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		if (args.length != 2) {
			System.out.println("Usage: CopyFile from to"); // CopyFile FIRST.TXT SECOND.TXT
			return;
		}

		try {
			fileInputStream = new FileInputStream(args[0]);
			fileOutputStream = new FileOutputStream(args[1]);

			do {
				input = fileInputStream.read();
				if (input != -1)
					fileOutputStream.write(input);
				
			} while (input != -1);
		} catch (IOException exception) {
			System.out.println("I/O Error: " + exception);
		} finally {
			try {
				if (fileInputStream != null)
					fileInputStream.close();
			} catch (IOException exception) {
				System.out.println("Error Closing Input File");
			}
			try {
				if (fileOutputStream != null)
					fileOutputStream.close();
			} catch (IOException exception) {
				System.out.println("Error Closing Ouput File");
			}

		}

	}

}
