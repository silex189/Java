package test.java.auxiliar.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExecutionReusabilityTest {
	
	private static int staticMember = 0;
	static {
		staticMember++;
		System.out.println("static code: " + staticMember);
	}
	
	private int instanceMember;
	
	public ExecutionReusabilityTest(){
		staticMember++;
		instanceMember++;
		System.out.println("constructor: " + staticMember + " and " +  instanceMember);
	}
	
	@BeforeClass
	public static void beforeClass(){
		staticMember++;
		System.out.println("before class: " + staticMember);
	}
	
	@Before
	public void before(){
		staticMember++;
		instanceMember++;
		System.out.println("before: " + staticMember + " and " +  instanceMember);
	}
	
	@Test
	public void test1(){
		staticMember++;
		instanceMember++;
		System.out.println("test 1: " + staticMember + " and " +  instanceMember);
	}
	
	@Test
	public void test2(){
		staticMember++;
		instanceMember++;
		System.out.println("test 2: " + staticMember + " and " +  instanceMember);
	}
	
	@Test
	public void test3(){
		staticMember++;
		instanceMember++;
		System.out.println("test 3: " + staticMember + " and " +  instanceMember);
	}
	
	@After
	public void after(){
		staticMember++;
		instanceMember++;
		System.out.println("after: " + staticMember + " and " +  instanceMember);
	}
	
	@AfterClass
	public static void afterClass(){
		staticMember++;
		System.out.println("after class: " + staticMember);
	}
	
	
}
