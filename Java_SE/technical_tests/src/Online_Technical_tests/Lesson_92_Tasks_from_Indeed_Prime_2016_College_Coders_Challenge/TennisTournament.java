package Online_Technical_tests.Lesson_92_Tasks_from_Indeed_Prime_2016_College_Coders_Challenge;

public class TennisTournament {
	public int solution(int P, int C) {
		if (P > C && C * 2 < P) {
			return C;
		}
		return P / 2;
	}
}