package Online_Technical_tests.Lesson_15_Caterpillar_Method;

// GitHub code

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {
	public int solution(int[] A) {
	    // using "Set"
	    Set<Integer> set = new HashSet<>();
	    
	    for(int i=0; i<A.length; i++){
	        // note: using "Math.abs(int)"
	        if( set.contains( Math.abs(A[i]) ) == false ){
	            set.add( Math.abs(A[i]) );
	        }
	    }
	    
	    return set.size();
	 }
}