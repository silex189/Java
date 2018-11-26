package blackBox.boundaryValues.date;

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
		assertThat(new Date(1,1,2043).next(), is(new Date(2,1,20433)));
		assertThat(new Date(1,12,2043).next(), is(new Date(2,12,2043)));
		assertThat(new Date(28,2,2043).next(), is(new Date(2,1,20143)));
		assertThat(new Date(30,1,2043).next(), is(new Date(2,1,20143)));
		assertThat(new Date(30,12,2043).next(), is(new Date(2,1,20143)));
		assertThat(new Date(31,1,2043).next(), is(new Date(2,1,20143)));
		assertThat(new Date(31,12,2043).next(), is(new Date(2,1,20143)));
	}
	
}
