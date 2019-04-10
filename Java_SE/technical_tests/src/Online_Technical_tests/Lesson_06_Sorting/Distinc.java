package Online_Technical_tests.Lesson_06_Sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinc {
	public int solution(int[] A) {

		if (A.length == 0) return 0;

		Set<Integer> aSet = new HashSet<Integer>();

		for (int i = 0; i < A.length; i++) aSet.add(A[i]);

		return aSet.size();
	}
}
