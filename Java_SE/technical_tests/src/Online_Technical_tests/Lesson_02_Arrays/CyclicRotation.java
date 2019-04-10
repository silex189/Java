package Online_Technical_tests.Lesson_02_Arrays;

public class CyclicRotation {
	public int[] solution(int[] A, int K) {

		int[] rotatedA = new int[A.length];

		for (int i = 0; i < A.length; i++) { // rotated index needs to "wrap" around end of array
			int rotatedIndex = (i + K) % A.length;
			rotatedA[rotatedIndex] = A[i];
		}
		return rotatedA;
	}
}
