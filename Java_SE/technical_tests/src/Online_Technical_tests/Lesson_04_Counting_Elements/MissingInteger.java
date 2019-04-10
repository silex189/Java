package Online_Technical_tests.Lesson_04_Counting_Elements;

import java.util.HashSet;
import java.util.Arrays;
// Demo test
public class MissingInteger {
	public int solution(int[] A) {
		assert A.length <= 100000 : "Array bigger than 100000";
		assert A != null : "Array null";
		
		Arrays.sort(A);
		
		int minValue = 1;
        HashSet<Integer> processedArray = new HashSet<Integer>();

        for (int i = 0 ; i < A.length; i++) {
  	      if (A[i] > 1000000 || A[i] < -1000000) {
	    	  assert false;
	      }
            processedArray.add(A[i]);    
        }

         while (processedArray.contains(minValue)) {
                minValue++;
            }

        return minValue;
	}
}	
	/* comprobar la ineficiencia de éste código 
	  y por qué usar hashset en lugar de TreeSet */
//		assert A.length <= 100000 : "Array bigger than 100000";
//		assert A != null : "Array null";
//		
//		Arrays.sort(A);
//
//	    Set<Integer> originalArray = new TreeSet<Integer>();
//	    Set<Integer> minimumValue = new TreeSet<Integer>();
//
//	    for(int i=0; i<A.length; i++) {
//	      originalArray.add(A[i]);   //convert array to set to get rid of duplicates, order int's
//	      minimumValue.add(i+1);  //create perfect set so can find missing int
//	      if (A[i] > 1000000 || A[i] < -1000000) {
//	    	  assert false;
//	      }
//	    }
//
//	    for(int current : minimumValue) {
//	      if(!originalArray.contains(current)) {
//	        return current;
//	      }
//	    }
//
//	    if(minimumValue.size() == originalArray.size()) {
//	      return minimumValue.size() + 1;  //e.g. {1, 2, 3} should return 4
//	    }
//
//	    return 1; //default - e.g. if A array has negative values or just a single positive value like 10
//	  }
