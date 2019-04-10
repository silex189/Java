package Online_Technical_tests.Lesson_08_Leader;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class EquiLeader {
	public int solution(int[] A) {

		Stack<Integer> stack = new Stack();

		for (int i = 0; i < A.length; i++) {
			if (stack.isEmpty()) {
				stack.push(A[i]);
			} else {
				if (stack.peek().intValue() == A[i]) {
					stack.push(A[i]);
				} else {
					stack.pop();
				}
			}
		}
		// no equi leaders if stack is empty
		if (stack.isEmpty()) return 0;

		int candidate = stack.peek().intValue();
		int dominatorCount = 0;

		Map<Integer, Integer> dominatorMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] == candidate) {
				dominatorCount++;
				dominatorMap.put(i, dominatorCount);
			}
		} 
		// works for even and odd number of A elements //e.g. if A.length = 4, count
		// needs to be > 2
		// e.g. if A.length = 5, count needs to be > 2

		int equiLeaders = 0;

		if (dominatorCount > (A.length / 2)) {
			// find all equi leader sequences
			int lastCandidateOccurenceIndex = 0;
			int runningDominatorCount = 0;

			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] == candidate) {
					lastCandidateOccurenceIndex = i;
					runningDominatorCount = dominatorMap.get(i).intValue();
				} else if (dominatorMap.get(lastCandidateOccurenceIndex) != null) {
					runningDominatorCount = dominatorMap.get(lastCandidateOccurenceIndex).intValue();
				}
				if (runningDominatorCount > (i + 1) / 2) {
					if ((dominatorCount - runningDominatorCount) > (A.length - (i + 1)) / 2) {
						equiLeaders++;
					}
				}
			}
		}
		return equiLeaders;
	}
}