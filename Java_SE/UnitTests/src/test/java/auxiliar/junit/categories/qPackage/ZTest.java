package test.java.auxiliar.junit.categories.qPackage;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import auxiliar.junit.categories.SlowTest;
import auxiliar.junit.categories.SmokeTest;

public class ZTest {

	@Test
	@Category({SmokeTest.class, SlowTest.class})
	public void testOne() {
		System.out.println("testOne of ZTest of qPackage. SmokeTest!!! SlowTest!!!");
	}
	
	@Test
	public void testTwo() {
		System.out.println("testTwo of ZTest of qPackage");
	}
	
	@Test
	public void testThree() {
		System.out.println("testThree of ZTest of qPackage");
	}
}
