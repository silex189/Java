package samples;

import java.io.*;

public class BufferedReaderDemo {
	
	public static void main(String args[]) 
			throws java.io.IOException {
	
	BufferedReader bufferedReader = 
			new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("what's your name?");
	String answer = bufferedReader.readLine();
	
	System.out.println("your age");
	int age = Integer.parseInt(bufferedReader.readLine());
	
	System.out.println("You are " + answer + " and you also are " + age);
	
	}
	

}
