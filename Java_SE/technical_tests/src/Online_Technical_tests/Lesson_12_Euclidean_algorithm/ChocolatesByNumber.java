package Online_Technical_tests.Lesson_12_Euclidean_algorithm;

public class ChocolatesByNumber {
    public int solution(int N, int M) {
		  return N / greatestCommonDivisorByDivision(N, M);
		  }

	  private int greatestCommonDivisorByDivision(int A, int B) {
		  if(A % B == 0) return B;
		  else return greatestCommonDivisorByDivision(B, A % B);
		  }
}	  