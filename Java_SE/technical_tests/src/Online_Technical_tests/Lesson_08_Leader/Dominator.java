package Online_Technical_tests.Lesson_08_Leader;

import java.util.Stack;

public class Dominator {
	public int solution(int[] A) {
        int count = 0;
        Stack<Integer> integerStack = new Stack<Integer>();

        for (int i = 0; i < A.length; i++) {
            if (integerStack.isEmpty()) {
                integerStack.push(A[i]);
            } else if (integerStack.size() > 0) {
                if (integerStack.peek() == A[i])
                    integerStack.push(A[i]);
                else
                    integerStack.pop();
            }
        }
        if (!integerStack.isEmpty()) {
            for (int i = 0; i < integerStack.size(); i++) {
                for (int j = 0; j < A.length; j++) {
                    if (integerStack.get(i) == A[j])
                        count++;
                    if (count > A.length / 2)
                        return j;
                }
                count = 0;
            }
        }
        return -1;
    }
}