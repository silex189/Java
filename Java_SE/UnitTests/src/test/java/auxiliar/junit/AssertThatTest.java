package test.java.auxiliar.junit;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThan;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;
import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;
import static org.hamcrest.text.IsEmptyString.isEmptyString;
import static org.hamcrest.text.IsEmptyString.isEmptyOrNullString;
import static org.hamcrest.collection.IsArrayContaining.hasItemInArray;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AssertThatTest {

	@Test
	public void test() {
		assertThat(6, is(equalTo(6)));
		assertThat(6, is(not(equalTo(5))));
		
		assertThat(6, is(6));
		assertThat(6, is(not(7)));
		
		assertThat(6, is(greaterThan(5)));
		assertThat(6, is(not(greaterThan(6))));
		
		assertThat(6, is(greaterThanOrEqualTo(5)));
		assertThat(6, is(not(greaterThanOrEqualTo(7))));
		
		assertThat(6, is(lessThan(7)));
		assertThat(6, is(not(lessThan(5))));
		
		assertThat(6, is(lessThanOrEqualTo(9)));
		assertThat(6, is(not(lessThanOrEqualTo(3))));
		
		assertThat(6.5, is(closeTo(6.4, 0.1)));
		assertThat(6.5, is(not(closeTo(6.4, 0.05))));
		
		assertThat(null, is(nullValue()));
		assertThat(new X(), is(not(nullValue())));
		
		assertThat(new X(), is(notNullValue()));
		assertThat(null, is(not(notNullValue())));
		
		X a = new X();
		X b = a;
		X c = new X();
		assertThat(a, is(sameInstance(b)));
		assertThat(a, is(not(sameInstance(c))));
		
		assertThat(a, instanceOf(X.class));
		
		assertThat("hola", is(equalToIgnoringCase("HolA")));
		assertThat("hola", is(not(equalToIgnoringCase("HolA "))));
		
		assertThat("hola Paula!", is(equalToIgnoringWhiteSpace("hola  Paula!")));
		assertThat("ho,bro!", is(not(equalToIgnoringWhiteSpace("hi, bro!"))));
		
		assertThat(5, allOf(greaterThan(0), lessThan(10)));
		assertThat(500, anyOf(greaterThan(0), lessThan(10)));
	}
	
	@Test
	public void testAssertEquals() {
		int expectedInt = 0;
		int resultInt = 0;
		assertEquals(expectedInt, resultInt);
		// with assertThat
		assertThat(resultInt, is(equalTo(expectedInt)));
		assertThat(resultInt, equalTo(expectedInt));
		assertThat(resultInt, is(expectedInt));

		byte expectedByte = 0;
		byte resultByte = 0;
		assertEquals(expectedByte, resultByte);
		// with assertThat
		assertThat(resultByte, equalTo(expectedByte));

		short expectedShort = 0;
		short resultShort = 0;
		assertEquals(expectedShort, resultShort);
		// with assertThat
		assertThat(resultShort, equalTo(expectedShort));

		long expectedLong = 0;
		long resultLong = 0;
		assertEquals(expectedLong, resultLong);
		// with assertThat
		assertThat(resultLong, equalTo(expectedLong));

		float expectedFloat = 0;
		float resultFloat = 0;
		assertEquals(expectedFloat, resultFloat, 0.001);
		// with assertThat
		assertThat((double) resultFloat, closeTo(expectedFloat, 0.001));

		double expectedDouble = 0;
		double resultDouble = 0;
		assertEquals(expectedDouble, resultDouble, 0.001);
		// with assertThat
		assertThat(resultDouble, closeTo(expectedDouble, 0.001));

		char expectedChar = 0;
		char resultChar = 0;
		assertEquals(expectedChar, resultChar);
		// with assertThat
		assertThat(resultChar, equalTo(expectedChar));

		boolean expectedBoolean = true;
		boolean resultBoolean = true;
		assertEquals(expectedBoolean, resultBoolean);
		// with assertThat
		assertThat(resultBoolean, equalTo(expectedBoolean));

		X expectedX = new X();
		X resultX = expectedX;
		assertEquals(expectedX, resultX);
		// with assertThat
		assertThat(resultX, equalTo(expectedX));
	}

	@Test
	public void testAssertTrue() {
		boolean resultBoolean = true;
		assertTrue("should be true", resultBoolean);
		assertTrue(resultBoolean);
		// with assertThat
		assertThat(resultBoolean, equalTo(true));
	}

	@Test
	public void testAssertFalse() {
		boolean resultBoolean = false;
		assertFalse("should be true", resultBoolean);
		assertFalse(resultBoolean);
		// with assertThat
		assertThat(resultBoolean, equalTo(false));
	}

	@Test
	public void testAssertNull() {
		X resultX = null;
		assertNull("should be null", resultX);
		assertNull(resultX);
		// with assertThat
		assertThat(resultX, nullValue());
	}

	@Test
	public void testAssertNotNull() {
		X resultX = new X();
		assertNotNull("should be not null", resultX);
		assertNotNull(resultX);
		// with assertThat
		assertThat(resultX, not(nullValue()));
		assertThat(resultX, notNullValue());
	}

	@Test
	public void testAssertSame() {
		X expectedX = new X();
		X resultX = expectedX;
		assertSame("should be same", expectedX, resultX);
		assertSame(expectedX, resultX);
		// better than
		assertThat(resultX, sameInstance(resultX));
	}

	@Test
	public void testAssertNotSame() {
		X expectedX = new X();
		X resultX = new X();
		assertNotSame("should be distinc", expectedX, resultX);
		assertNotSame(expectedX, resultX);
		// better than
		assertThat(resultX, not(sameInstance(expectedX)));
	}

	@Test
	public void testAssertArrayEquals() {
		byte[] expected = "trial".getBytes();
		byte[] actual = "trial".getBytes();
		assertArrayEquals("failure - byte arrays not same", expected, actual);

		int[] expectedIntArray = new int[] { 1, 2, 3 };
		int[] resultIntArray = new int[] { 1, 2, 3 };
		assertArrayEquals(expectedIntArray, resultIntArray);

		X[] expectedXArray = new X[] { new X(), new X(), new X() };
		X[] resultXArray = new X[] { expectedXArray[0], expectedXArray[1],
				expectedXArray[2] };
		// Not!!!! X[] resultXArray = new X[] {new X(), new X(), new X()};
		assertArrayEquals(expectedXArray, resultXArray);
	}

	@Test
	public void testAssertThatForString() {
		String resultString = null;
		assertThat(resultString, isEmptyOrNullString());
		resultString = "";
		assertThat(resultString, isEmptyOrNullString());
		assertThat(resultString, isEmptyString());
		resultString = "characters";
		assertThat(resultString, equalToIgnoringWhiteSpace(" characters "));
		assertThat(resultString, equalToIgnoringCase("CHARACTERS"));
		assertThat(resultString, startsWith("char"));
		assertThat(resultString, endsWith("cters"));
	}

	@Test
	public void testAssertThatForRelational() {
		int resultInt = 1;
		assertThat(resultInt, greaterThan(0));
		assertThat(resultInt, greaterThanOrEqualTo(0));
		assertThat(resultInt, greaterThanOrEqualTo(1));
		assertThat(resultInt, lessThan(2));
		assertThat(resultInt, lessThanOrEqualTo(2));
		assertThat(resultInt, lessThanOrEqualTo(1));
	}

	@Test
	public void testAssertThatCombined() {
		assertThat("characters", allOf(startsWith("char"), endsWith("ters")));
		assertThat("characters", anyOf(containsString("car"), containsString("rac")));
	}

	@Test
	public void testAssertThatArray() {
		Integer[] resultList = new Integer[] {1, 2, 3};
		assertThat(resultList, hasItemInArray(2));
		assertThat(resultList, arrayContainingInAnyOrder(1, 3, 2));
	}
	
	@Test
	public void testAssertThatCollections() {
		List<Integer> resultList = Arrays.asList(1, 2, 3);
		assertThat(resultList, hasItem(2));
		assertThat(resultList, hasItems(1, 3));
		assertThat(resultList, everyItem(greaterThan(0)));
	}

}
