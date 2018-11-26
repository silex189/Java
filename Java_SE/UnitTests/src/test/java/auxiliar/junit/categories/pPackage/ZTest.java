package test.java.auxiliar.junit.categories.pPackage;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import auxiliar.junit.categories.SmokeTest;

public class ZTest {

	@Test
	public void testOne() {
		System.out.println("testOne of ZTest of pPackage");
	}
	
	@Test
	public void testTwo() {
		System.out.println("testTwo of ZTest of pPackage");
	}
	
	@Test
	@Category(SmokeTest.class)
	public void testThree() {
		System.out.println("testThree of ZTest of pPackage. SmokeTest!!!");
	}
}
