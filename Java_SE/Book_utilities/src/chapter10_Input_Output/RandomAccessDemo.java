package chapter10_Input_Output;

import java.io.*;

public class RandomAccessDemo {

	public static void main(String[] args) {
		double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
		double d;

		try (RandomAccessFile randomAccessFile = new RandomAccessFile("testing_files/random.dat", "rw")) {
			for (int i = 0; i < data.length; i++) {
				randomAccessFile.writeDouble(data[i]);
			}

			randomAccessFile.seek(0);
			d = randomAccessFile.readDouble();
			System.out.println("First value is " + d);

			randomAccessFile.seek(8);
			d = randomAccessFile.readDouble();
			System.out.println("Second value is " + d);

			randomAccessFile.seek(8 * 3);
			d = randomAccessFile.readDouble();
			System.out.println("Fourth value is " + d);

			System.out.println();

			System.out.println("Here is every other value: ");
			for (int i = 0; i < data.length; i++) {
				randomAccessFile.seek(8 * i);
				d = randomAccessFile.readDouble();
				System.out.println(d + " ");
			}

		} catch (IOException exception) {
			System.out.println("I/O Error: " + exception);
		}

	}

}
