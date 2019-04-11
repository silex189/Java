package chapter13_Generics;

public class RawGenericDemo {

	public static void main(String[] args) {
		Generic<Integer> integerGeneric = new Generic<Integer>(88);
		Generic<String> stringGeneric = new Generic<String>("Generic Test");
		
		Generic raw = new Generic(new Double(98.6));
		
		double d = (Double) raw.getObject();
		System.out.println("value: " + d);
		
//		int i = (Integer) raw.getObject(); // Runtime error
		
		stringGeneric = raw; // crashing type security
//		String str = stringGeneric.getObject(); // Runtime error
		
		raw = integerGeneric; // crashing type security
//		d = (Double) raw.object; // Runtime error

	}

}
