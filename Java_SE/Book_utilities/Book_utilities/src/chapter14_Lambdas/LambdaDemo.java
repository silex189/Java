package chapter14_Lambdas;

@FunctionalInterface
interface InterfaceValue {
	double getValue();
}

@FunctionalInterface
interface InterfaceParameter {
	double getValue(double d);
}


public class LambdaDemo {

	public static void main(String[] args) {
		
		InterfaceValue interfaceValue;
		interfaceValue = () -> 98.6;
		System.out.println("A constant value: " + interfaceValue.getValue());
		
		InterfaceParameter interfaceParameter = (n) -> 1.0 / n;
		System.out.println("Reciprocal of 4 is " + interfaceParameter.getValue(4.0));
		System.out.println("Reciprocal of 8 is " + interfaceParameter.getValue(8.0));
		
//		interfaceValue = () -> "three";
//		interfaceParameter = () -> Math.random();

	}

}
