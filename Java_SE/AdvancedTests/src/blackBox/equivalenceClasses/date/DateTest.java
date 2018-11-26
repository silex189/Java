package blackBox.equivalenceClasses.date;

import org.junit.Test;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.is;

public class DateTest {

	@Test(expected = AssertionError.class)
	public void testDateWithGreaterThanDayError(){
		new Date(29,2,1900);
	}
	
	@Test(expected = AssertionError.class)
	public void testDateWithLessThanDayError(){
		new Date(0,2,2011);
	}
	
	@Test(expected = AssertionError.class)
	public void testDateWithGreaterThanMonthError(){
		new Date(14,13,2016);
	}
	
	@Test(expected = AssertionError.class)
	public void testDateWithLessThanMonthError(){
		new Date(14,0,2016);
	}
	
	@Test(expected = AssertionError.class)
	public void testNext(){
		assertThat(new Date(12,6,1968).next(), is(new Date(13,6,1968)));
	}
	
}
