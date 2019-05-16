package Online_Technical_tests_Testing.Lesson_04_Counting_Elements;


import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import Online_Technical_tests.Lesson_04_Counting_Elements.MissingInteger;

public class MissingIntegerShould {
	
	private MissingInteger missingInteger;
	
	@BeforeEach
	public void setUp() {
		missingInteger = new MissingInteger();
	}
	

	@Test
	public void return_3() {
		
		int myArray[] = { 2, 9, 15, 23, 22 };
		assertThat(missingInteger.solution(myArray), is(1));
	}
	
	@Test
	public void return_5() {
		
		int myArray[] = { 1, 3, 6, 4, 1, 2 };
		assertThat(missingInteger.solution(myArray), is(5));
	}
	
	@Test
	public void return_4() {
		int myArray[] = {1, 2, 3};
		
		assertThat(missingInteger.solution(myArray), is(4));
	}
	
	@Test
	public void return_1() {
		
		int myArray[] = {-1, -3};
		assertThat(missingInteger.solution(myArray), is(1));
	}
	
	@Test
	public void array_bigger_than_100000() {
		
		int myArray[] = new int[100001];
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = i;
		}
		
		assertThrows(AssertionError.class, () -> {
			missingInteger.solution(myArray);
		});
	}
	
	@Test
	public void array_smaller_than_1() {
		
		assertThrows(NullPointerException.class, () -> {
			missingInteger.solution(null);
		});
	}
	
	@Test
	public void array_value_bigger_than_million() {
		
		int myArray[] = { 1000001 };
		
		assertThrows(AssertionError.class, () -> {
			missingInteger.solution(myArray);
		});
	}
	
	@Test
	public void array_value_smaller_than_million() {
		
		int myArray[] = { -1000001 };
		
		assertThrows(AssertionError.class, () -> {
			missingInteger.solution(myArray);
		});
	}

}
