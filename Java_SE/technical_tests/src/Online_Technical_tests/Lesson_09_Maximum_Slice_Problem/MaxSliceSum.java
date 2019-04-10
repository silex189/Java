package Online_Technical_tests.Lesson_09_Maximum_Slice_Problem;

public class MaxSliceSum {
	public int solution(int[] A) {
		int absoluteMax = A[0];
		int localMax = A[0];
		int nextSum = 0;
		int currentElement = 0;

		for (int i = 1; i < A.length; i++) {
			currentElement = A[i];
			nextSum = localMax + currentElement;
			localMax = Math.max(A[i], nextSum);
			absoluteMax = Math.max(absoluteMax, localMax);
		}
		return absoluteMax;
	}
}