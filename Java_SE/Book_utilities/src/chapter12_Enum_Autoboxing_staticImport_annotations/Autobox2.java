package chapter12_Enum_Autoboxing_staticImport_annotations;

public class Autobox2 {
	
	static void showInteger(Integer integer) {
		System.out.println("method1() received " + integer);
	}

	static int returnInt() {
		return 10;
	}
	
	static Integer returnInteger() {
		return 99;
	}
	
	public static void main(String[] args) {
		showInteger(199);
		
		Integer integer = returnInt();
		System.out.println("Return value from method2() is " + integer);
		
		int i = returnInteger();
		System.out.println("Return value from method3() is " + i);
		
		integer = 100;
		System.out.println("Square root of integer is " + Math.sqrt(integer));


	}

}
