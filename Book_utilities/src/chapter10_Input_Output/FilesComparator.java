package chapter10_Input_Output;

import java.io.*;

public class FilesComparator {
	
	static int counter = 0;
	
	
	static boolean noCaseSensitiveChecker(int i, int j) {
		if ( (char) (i + 32) != j && (char) (i - 32) != j && i != j) {
			System.out.println("Number of first diferent letter is:  " + counter);
			return true; //break
		} 
			
		return false; 
		
	}


	static boolean caseSensitiveChecker(int i, int j) {
		if (i != j) {
			System.out.println("Number of first diferent letter is:  " + counter);
			return true;
		}
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
				
//				if (caseSensitiveChecker(i, j)) break;
				if (noCaseSensitiveChecker(i, j)) break;
				counter += 1;
			} while (i != -1 && j != -1);

			if (i == j)
				System.out.println("Files differ");
			else
				System.out.println("Files are the same");

		} catch (IOException exception) {
			System.out.println("I/O Error: " + exception);
		}

	}

}
