package chapter6;

class StaticMeth {
	static int value = 1024;

	static int valueDivide2() {
		return value/2;
	}
}

public class StaticDemo2 {

	public static void main(String[] args) {
		
		System.out.println("value is " + StaticMeth.value);
		System.out.println("StaticMeth.valueDivide2(): " + StaticMeth.valueDivide2());

		StaticMeth.value = 4;
		System.out.println("value is " + StaticMeth.value);
		System.out.println("StaticMeth.valueDivide2(): " + StaticMeth.valueDivide2());

	}

}
