package chapter5;

public class TernaryAvoidZeroDivision {

	public static void main(String[] args) {
		
		int result;

		for(int i = -5; i < 6; i++) {
			result = i != 0 ? 100 / i : 0; // avoid 0 division
			if(i != 0)
			System.out.println("100 / " + i + " is " + result);
		}
		
		System.out.println("\n");
		
		for(int i = -5; i < 6; i++) {
			if(i != 0 ? true : false)
				System.out.println("100 / " + i + " is " + 100 / i); // efficient way
		}

	}

}
