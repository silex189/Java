package chapter06_Methods_And_Classes_In_Deep;

class StaticDemonstration {
	
	int x;
	static int y;

	int sum() {
		return x + y;
	}
	
}

public class StaticDemo {
	public static void main(String[] args) {
		
		StaticDemonstration staticDemo1 = new StaticDemonstration();
		StaticDemonstration staticDemo2 = new StaticDemonstration();

		staticDemo1.x = 10;
		staticDemo2.x = 20;
		
		System.out.println("Of course, staticDemo1.x and " +
					 "staticDemo2 are independent");
		System.out.println("staticDemo1.x: " + staticDemo1.x + 
			"\nstaticDemo2: " + staticDemo2.x);
		
		System.out.println();

		System.out.println("The static variable is shared.");
		StaticDemonstration.y = 19;
		System.out.println("Set StaticDemonstration.y to 19");

		System.out.println("staticDemo1.sum(): " + staticDemo1.sum());
		System.out.println("staticDemo2.sum(): " + staticDemo2.sum());
		System.out.println();

		StaticDemonstration.y = 100;
		System.out.println("Change StaticDemonstration.y to 100");

		System.out.println("staticDemo1.sum(): " + staticDemo1.sum());
		System.out.println("staticDemo2.sum(): " + staticDemo2.sum());
		System.out.println();
		
	}
}
