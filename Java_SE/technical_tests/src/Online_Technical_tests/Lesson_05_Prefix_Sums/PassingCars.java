package Online_Technical_tests.Lesson_05_Prefix_Sums;

// stackoverflow code

public class PassingCars {
	public int solution(int[] A) {
		int count = 0;
		int multiply = 0;
		
		for (int car : A) {
			if (car == 0) {
				multiply = multiply + 1;
			}
			if (multiply > 0) {
				if (car == 1) {
					count = count + multiply;
					if (count > 1000000000) {
						return -1;
					}
				}
			}
		}
		return count;
	}
}