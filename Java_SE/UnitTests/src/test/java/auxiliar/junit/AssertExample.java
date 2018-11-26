package test.java.auxiliar.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertArrayEquals;

public class AssertExample {

	public void exampleAssertEquals() {
		byte expectedByte = 0;
		byte resultByte = 0;
		assertEquals("should be equals", expectedByte, resultByte);
		assertEquals(expectedByte, resultByte);
		
		short expectedShort = 0;
		short resultShort = 0;
		assertEquals(expectedShort, resultShort);
		
		int expectedInt = 0;
		int resultInt = 0;
		assertEquals(expectedInt, resultInt);
		
		long expectedLong = 0;
		long resultLong = 0;
		assertEquals(expectedLong, resultLong);
		
		float expectedFloat = 0;
		float resultFloat = 0;
		assertEquals(expectedFloat, resultFloat, 0.001);
		
		double expectedDouble = 0;
		double resultDouble = 0;
		assertEquals(expectedDouble, resultDouble, 0.001);
		
		char expectedChar = 0;
		char resultChar = 0;
		assertEquals(expectedChar, resultChar);
		
		boolean expectedBoolean = true;
		boolean resultBoolean = true;
		assertEquals(expectedBoolean, resultBoolean);
		
		X expectedX = new X();
		X resultX = expectedX;
		assertEquals(expectedX, resultX);
		
		String expectedString = "characters";
		String resultString = "characters";
		assertEquals(expectedString, resultString);
	}

	public void exampleAssertTrue() {
		boolean resultBoolean = true;
		assertTrue("should be true", resultBoolean);
		assertTrue(resultBoolean);
		// better than
		assertEquals(true, resultBoolean);
		assertFalse(!resultBoolean);
	}

	public void exampleAssertFalse() {
		boolean resultBoolean = false;
		assertFalse("should be true", resultBoolean);
		assertFalse(resultBoolean);
		// better than
		assertEquals(false, resultBoolean);
		assertTrue(!resultBoolean);
	}
	
	public void exampleAssertSame() {
		X expectedX = new X();
		X resultX = expectedX;
		assertSame("should be same", expectedX, resultX);
		assertSame(expectedX, resultX);
		// better than
		assertFalse(expectedX != resultX);
		assertTrue(expectedX == resultX);
	}
	
	public void exampleAssertNotSame() {
		X expectedX = new X();
		X resultX = new X();
		assertNotSame("should be distinc", expectedX, resultX);
		assertNotSame(expectedX, resultX);
		// better than
		assertTrue(expectedX != resultX);
		assertFalse(expectedX == resultX);
	}	
	
	public void exampleAssertNull() {
		X resultX = null;
		assertNull("should be null", resultX);
		assertNull(resultX);
		// better than
		assertFalse(resultX != null);
		assertTrue(resultX == null);
		assertEquals(null, resultX);
	}	
	
	public void exampleAssertNotNull() {
		X resultX = new X();
		assertNotNull("should be not null", resultX);
		assertNotNull(resultX);	
		// better than
		assertTrue(resultX != null);
		assertFalse(resultX == null);
	}
	
	public void exampleAssertArrayEquals() {
		int[] expectedIntArray = new int[] {1, 2, 3};
		int[] resultIntArray = new int[] {1, 2, 3};
		assertArrayEquals("should be equals", expectedIntArray, resultIntArray);
		assertArrayEquals(expectedIntArray, resultIntArray);
		
		X[] expectedXArray = new X[] {new X(), new X(), new X()};
		X[] resultXArray = new X[] {expectedXArray[0], expectedXArray[1], expectedXArray[2]};
		//Not!!!! X[] resultXArray = new X[] {new X(), new X(), new X()};
		assertArrayEquals(expectedXArray, resultXArray);
	}
	
//	public void exampleFail(){
//		fail("should abort");
//	}
	
	public static void main(String[] args){
		AssertExample assertExample = new AssertExample();
		assertExample.exampleAssertEquals();
		assertExample.exampleAssertTrue();
		assertExample.exampleAssertFalse();
		assertExample.exampleAssertSame();
		assertExample.exampleAssertNotSame();
		assertExample.exampleAssertNull();
		assertExample.exampleAssertNotNull();
		assertExample.exampleAssertArrayEquals();
//		assertExample.exampleFail();
	}
	
}