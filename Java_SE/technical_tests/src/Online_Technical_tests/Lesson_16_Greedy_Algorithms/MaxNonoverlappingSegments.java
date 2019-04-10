package Online_Technical_tests.Lesson_16_Greedy_Algorithms;

// GitHub code

public class MaxNonoverlappingSegments {
    public int solution(int A[], int B[]) {
        int N = A.length;
        if (N <= 1) {
            return N;
        }
        
        int cnt = 1;
        int prev_end = B[0];
        
        int curr;
        for (curr = 1; curr < N; curr++) {
            if (A[curr] > prev_end) {
                cnt++;
                prev_end = B[curr];
            }
        }
        
        return cnt;
    }
}