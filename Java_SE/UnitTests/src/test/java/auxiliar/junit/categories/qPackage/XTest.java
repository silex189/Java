package test.java.auxiliar.junit.categories.qPackage;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import auxiliar.junit.categories.SmokeTest;

public class XTest {

	@Test
	public void testOne() {
		System.out.println("testOne of XTest of qPackage");
	}
	
	@Test
	public void testTwo() {
		System.out.println("testTwo of XTest of qPackage");
	}
	
	@Test
	@Category(SmokeTest.class)
	public void testThree() {
		System.out.println("testThree of XTest of qPackage. SmokeTest!!!");
	}
}
