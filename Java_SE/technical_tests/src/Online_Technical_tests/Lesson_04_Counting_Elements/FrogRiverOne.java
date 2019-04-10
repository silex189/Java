package Online_Technical_tests.Lesson_04_Counting_Elements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
	public int solution(int X, int[] A) {

		Set<Integer> requiredLeavesSet = new HashSet<Integer>();
		
		for (int i = 1; i <= X; i++) {
			requiredLeavesSet.add(i);
		}

		Set<Integer> currentLeavesSet = new HashSet<Integer>();

		for (int p = 0; p < A.length; p++) {
			currentLeavesSet.add(A[p]);
			// keep adding to current leaves set until it's at least the same size as
			// required leaves set
			if (currentLeavesSet.size() < requiredLeavesSet.size())
				continue;
			if (currentLeavesSet.containsAll(requiredLeavesSet)) {
				return p;
			}
		}
		return -1;
	}
}
