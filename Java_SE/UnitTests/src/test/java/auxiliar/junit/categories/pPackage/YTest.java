package test.java.auxiliar.junit.categories.pPackage;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import auxiliar.junit.categories.SlowTest;
import auxiliar.junit.categories.SmokeTest;

public class YTest {

	@Test
	public void testOne() {
		System.out.println("testOne of YTest of pPackage");
	}
	
	@Test
	@Category(SmokeTest.class)
	public void testTwo() {
		System.out.println("testTwo of YTest of pPackage. SmokeTest!!!");
	}
	
	@Test
	@Category(SlowTest.class)
	public void testThree() {
		System.out.println("testThree of YTest of pPackage. SlowTest!!!");
	}
}
