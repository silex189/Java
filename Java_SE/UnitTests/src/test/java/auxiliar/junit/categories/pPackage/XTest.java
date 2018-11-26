package test.java.auxiliar.junit.categories.pPackage;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import auxiliar.junit.categories.SlowTest;
import auxiliar.junit.categories.SmokeTest;

public class XTest {

	@Test
	@Category({SmokeTest.class, SlowTest.class})
	public void testOne() {
		System.out.println("testOne of XTest of pPackage. SmokeTest!!! SlowTest!!!");
	}
	
	@Test
	public void testTwo() {
		System.out.println("testTwo of XTest of pPackage");
	}
	
	@Test
	public void testThree() {
		System.out.println("testThree of XTest of pPackage");
	}
}
