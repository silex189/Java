package chapter03_Control_Instructions;

public class ShowEvenNumbers {
	public static void main(String[] args) {
		
		int i;

		for(i = 0; i <= 100; i++) {
			if((i % 2) != 0) continue;
			System.out.println(i);
		}

	}

}