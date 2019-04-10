package Online_Technical_tests.Lesson_10_Prime_and_Composite_Numbers;

public class MinPerimeterRectangle {
	public int solution(int N) {
		int squareRootN = (int) Math.sqrt(N);
		int factor2 = 0;
		int perimeter = 0;
		int minPerimeter = Integer.MAX_VALUE;

		if (Math.pow(squareRootN, 2) != N) {
			squareRootN++; 
			// round up for any non-perfect squares
		} else { 
			// perfect square root won't be reached inside loop so calculate and set min
			// perimeter
			minPerimeter = 2 * (squareRootN + squareRootN);
		}

		for (int i = 1; i < squareRootN; i++) {
			if (N % i == 0) {
				// calculate 2nd factor by simple division since know 1st factor and N
				factor2 = N / i;
				perimeter = 2 * (factor2 + i);
				minPerimeter = Math.min(perimeter, minPerimeter);
			}
		}
		return minPerimeter;
	}
}