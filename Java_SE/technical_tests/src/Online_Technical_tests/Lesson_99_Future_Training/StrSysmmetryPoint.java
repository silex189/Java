package Online_Technical_tests.Lesson_99_Future_Training;

public class StrSysmmetryPoint {
    public int solution(String S) {
	    if ((S.length() & 1) == 0) {
	        return -1;
	    }
	    final int result = S.length() / 2;
	    for (int i = result, j = result; j >= 0; i++, j--) {
	        if (S.charAt(i) != S.charAt(j)) {
	            return -1;
	        }
	    }
	    return result;
	}
}