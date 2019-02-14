package challenges;



public class FizzBuzz {

	public static void main(String[] args) {
		int N, M;
		N = 2;
		M = 33;
		
		String sequence = new String();
		
		do {
			if (N % 15 == 0) {
				sequence += "FizzBuzz";
			} else if (N % 5 == 0) {
				sequence += "Buzz";
			} else if (N % 3 == 0) {
				sequence += "Fizz";
			} else {
				sequence += N;
			}
			
			if (N < M) {
				sequence += ",";
			}
			
			N++;
		} while (N <= M);
		
		System.out.println(sequence);
		
	}

}
