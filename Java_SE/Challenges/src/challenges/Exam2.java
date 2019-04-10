package challenges;

import java.util.Arrays;

public class Exam2 {
    public static int solution(int[] A) {
    	
        int[] valueDistances = new int[A.length];
        int[] distances = new int[A.length];
        int maxDistance = 0;
        Arrays.fill(valueDistances, Integer.MAX_VALUE);

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int currentValue = Math.abs(A[i] - A[j]);
                
                if (valueDistances[i] >= currentValue) {
                    valueDistances[i] = currentValue;
                    distances[i] = Math.abs(i - j);
                    
                    if (distances[i] > maxDistance) {
                        maxDistance = distances[i];
                    }
                }
                if (valueDistances[j] > currentValue)
                    valueDistances[j] = currentValue;
            }
        }
        return maxDistance > 0 ? maxDistance : -1;
    }
}