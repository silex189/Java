package chapter14_Lambdas;

@FunctionalInterface
interface PredicateInterface2 {
	boolean test(PredicateClass predicateClass, int number);
}

public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		boolean result;
		
		PredicateClass predicateClass1 = new PredicateClass(12);
		PredicateClass predicateClass2 = new PredicateClass(16);
		
		PredicateInterface2 predicateInterface2 = PredicateClass::isFactor;
		result = predicateInterface2.test(predicateClass1, 3);
		if (result)
			System.out.println("3 is a factor of " + predicateClass1.getNumber());
		
		result = predicateInterface2.test(predicateClass2, 3);
		if (!result)
			System.out.println("3 is a not factor of " + predicateClass2.getNumber());
		

	}

}
