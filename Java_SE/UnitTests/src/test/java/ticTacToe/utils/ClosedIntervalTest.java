package test.java.ticTacToe.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.ticTacToe.utils.ClosedInterval;

public class ClosedIntervalTest {

	@Test
	public void testLength() {
		assertEquals(22, new ClosedInterval(12, 34).length());
		assertEquals(4, new ClosedInterval(-8, -4).length());
	}

	@Test
	public void testShift() {
		ClosedInterval OUTClosedInterval = new ClosedInterval(12, 34);
		OUTClosedInterval.shift(16);
		assertEquals(new ClosedInterval(28, 50), OUTClosedInterval);
		OUTClosedInterval = new ClosedInterval(-8, -4);
		OUTClosedInterval.shift(6);
		assertEquals(new ClosedInterval(-2, 2), OUTClosedInterval);
	}
	
	@Test
	public void testIncludesValue() {
		assertTrue(new ClosedInterval(12, 34).includes(16));
		assertFalse(new ClosedInterval(-8, -4).includes(4));
	}
	
	@Test
	public void testIncludesClosedInterval() {
		assertTrue(new ClosedInterval(12, 34).includes(new ClosedInterval(16, 30)));
		assertTrue(new ClosedInterval(-8, -4).includes(new ClosedInterval(-7, -5)));
	}
	
	@Test
	public void testIntersected() {
		assertTrue(new ClosedInterval(12, 34).intersected(new ClosedInterval(16, 30)));
		assertTrue(new ClosedInterval(-8, -4).intersected(new ClosedInterval(-7, -5)));
	}
	
	@Test
	public void testIntersection(){
		assertEquals(new ClosedInterval(16, 30), new ClosedInterval(12, 34).intersection(new ClosedInterval(16, 30)));
		assertEquals(new ClosedInterval(-7, -5), new ClosedInterval(-8, -4).intersection(new ClosedInterval(-7, -5)));
	}
	
	@Test
	public void testUnion(){
		assertEquals(new ClosedInterval(12, 34), new ClosedInterval(12, 34).union(new ClosedInterval(16, 30)));
		assertEquals(new ClosedInterval(-8, -4), new ClosedInterval(-8, -4).union(new ClosedInterval(-7, -5)));
	}
	
}
