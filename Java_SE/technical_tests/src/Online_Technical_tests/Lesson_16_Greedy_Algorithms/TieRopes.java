package Online_Technical_tests.Lesson_16_Greedy_Algorithms;

// GitHub code

class Solution {
    public int solution(int K, int[] A) {
        int result = 0;
        int length = 0;
        for (int rope : A) {
            length += rope;
            if (length >= K) {
                result++;
                length = 0;
            }
        }
        return result;
    }
}
