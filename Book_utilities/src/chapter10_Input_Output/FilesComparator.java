package chapter10_Input_Output;

import java.io.*;

public class FilesComparator {
	
	static boolean camelSensitiveLetterChecker(int i, int j) {
		if ( ((char) i + 32) != j | ((char) i - 32) != j)  
			return true;
		return false;
	}
	
	static boolean letterChecker(int i, int j) {
		if (i != j)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int i, j = 0;

		if (args.length != 2) {
			System.out.println("Usage: FilesComparator file1 file2");
			return;
		}

		try (FileInputStream fileInputStream1 = new FileInputStream(args[0]);
				FileInputStream fileInputStream2 = new FileInputStream(args[1])) {
			do {
				i = fileInputStream1.read();
				j = fileInputStream2.read();

				if (camelSensitiveLetterChecker(i, j)) break;
//			if (letterChecker(i, j)) break;
			} while (i != -1 && j != -1);

			if (i != j)
				System.out.println("Files differ");
			else
				System.out.println("Files are the same");

		} catch (IOException exception) {
			System.out.println("I/O Error: " + exception);
		}

	}

}
