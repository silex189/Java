package Online_Technical_tests.Lesson_90_Task_from_Indeed_Prime_2015_Challenge;

public class LongestPassword {
	public int solution(String S) {
	    String[] words = S.replaceAll("\\s+", " ").split(" ");
	    int maxLength = -1;
	    for (String word : words) {
	        if (word.matches("^[0-9a-zA-Z]*$") &&
	                word.replaceAll("[0-9]+", "").length() % 2 == 0 &&
	                word.replaceAll("[a-zA-Z]+", "").length() % 2 == 1) {
	            maxLength = Math.max(maxLength, word.length());
	        }
	    }
	    return maxLength;
	}
}