package Online_Technical_tests.Lesson_04_Counting_Elements;
//stackoverflow code

public class MaxCounters {
	public int[] solution(int N, int[] A) {
        final int condition = N + 1;
        int currentMax = 0;
        int lastUpdate = 0;
        int countersArray[] = new int[N];

        for (int i = 0; i < A.length; i++) {
            int currentValue = A[i];
            
            if (currentValue == condition) {
                lastUpdate = currentMax;
            } else {
                int position = currentValue - 1;
                
                if (countersArray[position] < lastUpdate) 
                	countersArray[position] = lastUpdate + 1;
                else 
                	countersArray[position]++;

                if (countersArray[position] > currentMax) {
                    currentMax = countersArray[position];
                }
            }
        }

        for (int i = 0; i < N; i++)
           if (countersArray[i] < lastUpdate) countersArray[i] = lastUpdate;
        return countersArray;
    }
}
