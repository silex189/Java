package test.java.auxiliar.junit;

import org.junit.Test;
//import org.junit.FixMethodOrder;
//import org.junit.runners.MethodSorters;

//@FixMethodOrder(MethodSorters.DEFAULT)
//@FixMethodOrder(MethodSorters.JVM)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExecutionTest {

	private static int staticMember = 7;
	
	private int instanceMember;
	
	public ExecutionTest() {
		instanceMember = 666;
		System.out.println("New object: " + this);
	}
	
	@Test
	public void test5(){
		System.out.println("5> instance: " + instanceMember + " and static: " + staticMember);
		staticMember++;
		instanceMember++;
		System.out.println("5< instance: " + instanceMember + " and static: " + staticMember);
	}
	
	@Test
	public void test4(){
		System.out.println("4> instance: " + instanceMember + " and static: " + staticMember);
		staticMember++;
		instanceMember++;
		System.out.println("4< instance: " + instanceMember + " and static: " + staticMember);
	}
	
	@Test
	public void test3(){
		System.out.println("3> instance: " + instanceMember + " and static: " + staticMember);
		staticMember++;
		instanceMember++;
		System.out.println("3< instance: " + instanceMember + " and static: " + staticMember);
	}
	
	@Test
	public void test2(){
		System.out.println("2> instance: " + instanceMember + " and static: " + staticMember);
		staticMember++;
		instanceMember++;
		System.out.println("2< instance: " + instanceMember + " and static: " + staticMember);
	}
	
	@Test
	public void test1(){
		System.out.println("1> instance: " + instanceMember + " and static: " + staticMember);
		staticMember++;
		instanceMember++;
		System.out.println("1< instance: " + instanceMember + " and static: " + staticMember);
	}
	
	public void test0(){
		System.out.println("0> instance: " + instanceMember + " and static: " + staticMember);
		staticMember++;
		instanceMember++;
		System.out.println("0< instance: " + instanceMember + " and static: " + staticMember);
	}
	
}
