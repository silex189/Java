package samples;

class A {
	private int a1 = 1;
	private int a2 = 2;
	private int a3 = 3;
	
	A (){}
	
}

public class toStringTest {
	
	
	public static void main(String args[]) {
		
		A a = new A();
		
		System.out.println("Next gonna be toString on class A");
		System.out.println(a.toString());
		
		System.out.println("Next gonnba be the class directly");
		System.out.println(a);
		
	}

}
