package chapter03_Control_Instructions;

public class MakePowerOf2 {

	public static void main(String[] args) {
		
		int exponent;
		int result;

		for(int i = 0; i < 10; i++) {
			result = 1;
			exponent = i;
			while(exponent > 0) {
				result *= 2;
				exponent--;
			}
			System.out.println("2 to the " + i + " power is " + result);
		}

	}

}
