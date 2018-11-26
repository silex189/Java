package characteristics.executable.automated.controllerTest;

import static org.junit.Assert.assertThat;

import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CombinatoricsTest {

	private static Scanner reader;
	
	@AfterClass 
	public static void afterClass() {
		reader.close();	
	}
	
	@BeforeClass
	public static void beforeClass() {
		reader = new Scanner(System.in);
	}
	
	@Test(expected = AssertionError.class)
	public void testFactorialWithNegativeValueExceptionrror(){
		Combinatorics.factorial(-5);
	}
	
	@Test(expected = AssertionError.class)
	public void testFactorialWithMaxValueExceptionrror(){
		Combinatorics.factorial(Combinatorics.FACTORIAL_MAX_VALUE+1);
	}
	
	@Test
	public void testFactorial() {
		long value = read("factorial de?");
		long result = read("resultado?");
		assertThat(Combinatorics.factorial(value), is(result));
	}
	
	private static long read(String title) {
		System.out.print(title);
		return reader.nextInt();
	}
	
	@Test
	@Ignore
	public void calulateFactorialMaxValue() {
		long max = Long.MAX_VALUE;
		long min = 0;
		long average = average(max, min);
		boolean isStable;
		do {
			isStable = isStable(average, max, min);
			try {
				System.out.print(average +  " entre ["+min+", "+max+"] con ... ");
				System.out.print(Combinatorics.factorial(average));
				if (!isStable) {
					System.out.println(" A por más");
					min = average;
				}
			} catch (AssertionError ex) {
				if (!isStable) {
					System.out.println("Un poco menos");
					max = average;
				}
			} finally {
				average = average(max, min);
			}
		} while (!isStable);
	}
 
	private static long average(long max, long min) {
		return min + (max-min)/2; 
	}
	
	private static boolean isStable(long average, long max, long min){
		return (average == min || average == max);
	}

}


