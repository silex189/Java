package Online_Technical_tests.Lesson_06_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxProductOfThree {
	public int solution(int[] A) {

		List<Integer> aList = new ArrayList<Integer>();

		for (int i = 0; i < A.length; i++) aList.add(A[i]);

		Collections.sort(aList);
		int product1, product2, product3, product4 = 0;

		product1 = aList.get(0) * aList.get(1) * aList.get(2); 
		// first 3 elements
		product2 = aList.get(aList.size() - 3) * aList.get(aList.size() - 2) * aList.get(aList.size() - 1); 
		// last 3 elements
		product3 = aList.get(0) * aList.get(1) * aList.get(aList.size() - 1); 
		// first 2 and last element
		product4 = aList.get(0) * aList.get(aList.size() - 2) * aList.get(aList.size() - 1); 
		// first and last 2 elements

		int max1 = Math.max(product1, product2);
		int max2 = Math.max(product3, product4);

		return Math.max(max1, max2);
	}
}