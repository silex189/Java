package chapter10_Input_Output;

import java.io.*;

public class PrintWriterDemo {

	public static void main(String[] args) {
		PrintWriter printWriter = new PrintWriter(System.out, true);

		int i = 10;
		double d = 123.65;

		printWriter.println("Using a PrintWriter.");
		printWriter.println(i);
		printWriter.println(d);
		printWriter.println(i + " + " + d + " is " + (i + d));

	}

}
