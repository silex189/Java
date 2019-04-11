package chapter14_Lambdas;

class PredicateClass {
	private int value;
	
	PredicateClass(int value) {
		this.value = value;
	}
	
	int getNumber() { return value; }
	
	boolean isFactor(int number) {
		return ((value % number) == 0);
	}
}

public class MethodReferenceDemo2 {

	public static void main(String[] args) {
		boolean result;
		
		PredicateClass predicateClass1 = new PredicateClass(12);
		PredicateClass predicateClass2 = new PredicateClass(16);
		
		PredicateInterface predicateInterface = predicateClass1::isFactor;
		
		result = predicateInterface.test(3);
		if (result) System.out.println("3 is a factor of " + predicateClass1.getNumber());
		
		predicateInterface = predicateClass2::isFactor;
		result = predicateInterface.test(3);
		if (!result) System.out.println("3 is not a factor of " + predicateClass2.getNumber());
		

	}

}
