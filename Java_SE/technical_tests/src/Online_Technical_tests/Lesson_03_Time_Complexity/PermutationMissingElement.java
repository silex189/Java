package Online_Technical_tests.Lesson_03_Time_Complexity;

import java.util.HashSet;
import java.util.Set;

public class PermutationMissingElement {
	public int solution(int[] A) {

		int max = A.length + 1;
		// load array elements into array so would be quick to check if elements exist
		Set<Integer> incompleteSet = new HashSet<Integer>();

		for (int i = 0; i < A.length; i++) {
			incompleteSet.add(A[i]);
		}

		for (int i = 1; i < max + 1; i++) {
			if (!incompleteSet.contains(i)) {
				return (i);
			}
		}
		throw new RuntimeException("shouldn't reach here");
	}
}
