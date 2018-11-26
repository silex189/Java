package chapter03_Control_Instructions;

public class EmptyLoop {

	public static void main(String[] args) {

		int i;
		int sum = 0;

		for(i = 1; i <= 5; sum += i++); 
			
		System.out.println("Sum is " + sum);
	}

}
// using a for loop to make a sum