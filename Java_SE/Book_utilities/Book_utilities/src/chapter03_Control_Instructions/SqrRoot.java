package chapter03_Control_Instructions;

public class SqrRoot {
	public static void main(String[] args) {

		double num, sroot, rerr;

		for(num = 1.0; num < 10; num++) {
			sroot = Math.sqrt(num);
			System.out.println("Square root of " + num + " is " + sroot);

			// rounding error
			rerr = num - (sroot * sroot);
			System.out.println("Rounding error is " + rerr);
			System.out.println();
		}

	}
}
