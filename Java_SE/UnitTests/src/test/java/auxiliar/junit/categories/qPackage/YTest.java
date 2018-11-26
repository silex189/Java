package test.java.auxiliar.junit.categories.qPackage;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import auxiliar.junit.categories.SmokeTest;

public class YTest {

	@Test
	public void testOne() {
		System.out.println("testOne of YTest of qPackage");
	}
	
	@Test
	@Category(SmokeTest.class)
	public void testTwo() {
		System.out.println("testTwo of YTest of qPackage. SmokeTest!!!");
	}
	
	@Test
	public void testThree() {
		System.out.println("testThree of YTest of qPackage");
	}
}
