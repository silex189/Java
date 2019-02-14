package challenges;



public class FizzBuzz {

	public static void main(String[] args) {
		int N, M;
		N = 2;
		M = 33;
		
		
		do {
			if (N % 15 == 0) {
				System.out.print("FizzBuzz");
			} else if (N % 5 == 0) {
				System.out.print("Buzz");
			} else if (N % 3 == 0) {
				System.out.print("Fizz");
			} else {
				System.out.print(N);
			}
			
			if (N < M) {
				System.out.print(",");
			}
			
			N++;
		} while (N <= M);
		
	}

}
