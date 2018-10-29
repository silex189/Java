package chapter10_Input_Output;

import java.io.*;

public class NumberAverage {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int number;
		double sum = 0.0;
		double average, tmp;

		System.out.println("How many numbers will you enter: ");
		str = bufferedReader.readLine();

		try {
			number = Integer.parseInt(str);
		} catch (NumberFormatException exception) {
			System.out.println("Invalid format");
			number = 0;
		}

		System.out.println("Enter " + number + " values.");
		for(int i=0; i < number; i++) {
			System.out.println(": ");
			str = bufferedReader.readLine();
			try {
				tmp = Double.parseDouble(str);
			} catch (NumberFormatException exception) {
				System.out.println("Invalid format");
				tmp = 0.0;
			}
			sum += tmp;
		}
		average = sum / number;
		System.out.println("Average is " + average);

	}

}
