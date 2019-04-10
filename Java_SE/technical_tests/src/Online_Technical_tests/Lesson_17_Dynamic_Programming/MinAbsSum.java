package Online_Technical_tests.Lesson_17_Dynamic_Programming;

// GitHub code

public class MinAbsSum {
	public int solution(int[] A){
	    if (A.length == 0) return 0;
	    if (A.length == 1) return A[0];
	    
	    int sum = 0;
	    
	    for (int i=0;i<A.length;i++){
	        sum += Math.abs(A[i]);
	    }
	    
	    int[] indices = new int[A.length];
	    indices[0] = 0;
	    int half = sum/2;
	    int localSum = Math.abs(A[0]);
	    int minLocalSum = Integer.MAX_VALUE;
	    int placeIndex = 1;
	    
	    for (int i=1;i<A.length;i++){
	        if (localSum<half){
	            if (Math.abs(2*minLocalSum-sum) > Math.abs(2*localSum - sum))
	                minLocalSum = localSum;
	            localSum += Math.abs(A[i]);
	            indices[placeIndex++] = i;
	        }else{
	            if (localSum == half)
	                return Math.abs(2*half - sum);

	            if (Math.abs(2*minLocalSum-sum) > Math.abs(2*localSum - sum))
	                minLocalSum = localSum;
	            if (placeIndex > 1) {
	                localSum -= Math.abs(A[indices[placeIndex--]]);
	                i = indices[placeIndex];
	            }
	        }
	    }
	    return (Math.abs(2*minLocalSum - sum));
	}
}
