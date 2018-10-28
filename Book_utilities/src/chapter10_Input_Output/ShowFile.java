package chapter10_Input_Output;

import java.io.*;

public class ShowFile {

	public static void main(String[] args) {
		int input;
		FileInputStream fileInputStream = null;

		if (args.length != 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}

		try {
			fileInputStream = new FileInputStream(args[0]);
			do {
				input = fileInputStream.read();
				if (input != -1)
					System.out.println((char) input);
			} while (input != -1);
		} catch (FileNotFoundException exception) {
			System.out.println("File not found.");
		} catch (IOException exception) {
			System.out.println("An I/O Error Occurred");
		} finally {
			try {
				if (fileInputStream != null)
					fileInputStream.close();
			} catch (IOException exception) {
				System.out.println("Error Closing File");
			}
		}

	}

}
