package Online_Technical_tests.Lesson_06_Sorting;

// stackoverflow code

public class NumberDiscIntersections {
	public int solution(int[] A) {
	    int result = 0;
	    int[] dps = new int[A.length];
	    int[] dpe = new int[A.length];

	    for (int i = 0, t = A.length - 1; i < A.length; i++)
	    {
	        int s = i > A[i]? i - A[i]: 0;
	        int e = t - i > A[i]? i + A[i]: t;
	        dps[s]++;
	        dpe[e]++;
	    }

	    int t = 0;
	    for (int i = 0; i < A.length; i++)
	    {
	        if (dps[i] > 0)
	        {
	            result += t * dps[i];
	            result += dps[i] * (dps[i] - 1) / 2;
	            if (10000000 < result) return -1;
	            t += dps[i];
	        }
	        t -= dpe[i];
	    }

	    return result;
	}
}
