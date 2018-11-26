package util;

import java.util.Scanner;

public class AmazonUtil {
	
	public static int validateUserResponseMenu(int min, int max) {
		//Reading user respond
		Scanner sc = new Scanner(System.in);
		
		//validate int respond
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("You entered an invalid option"); 
			System.out.println("Try again");
		}
		
		int response = sc.nextInt();
		
		//Validating response range
		while(response < min || response > max) {
			//Request for a new response
			System.out.println("You entered an invalid option");
			System.out.println("Try again");
			
			while(!sc.hasNextInt()) {
				sc.next();
				System.out.println("You entered an invalid option");
				System.out.println("Try again");
			}
			response = sc.nextInt();
		}
		System.out.println("Your option: " + response + "\n");
		return response;
	}

}
