package Online_Technical_tests.Lesson_90_Task_from_Indeed_Prime_2015_Challenge;

// GitHub code

public class FloodDepth {
    public int solution(int[] A) {
	    int highestIdx = 0;
	    int lowestIdx = 0;
	    int max = 0;
	
	    for (int i = 1; i < A.length; i++) {
	        int current = A[i];
	        int highest = A[highestIdx];
	        int lowest = A[lowestIdx];
	        if (current > highest) {
	            max = Math.max(highest - lowest, max);
	            highestIdx = i;
	            lowestIdx = highestIdx;
	        } else if (current > lowest) {
	            max = Math.max(current - lowest, max);
	        } else if (current < lowest) {
	            lowestIdx = i;
	        }
	    }
	    return max;
	}
}