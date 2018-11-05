package chapter14_Lambdas;

interface ConstructorInterface {
	MyClass construct(String string);
}

class MyClass {
	private String string;
	
	MyClass(String string) { 
		this.string = string;
	}
	
	MyClass() { string = ""; }
	
	String getString() { return string; }
	
}

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		ConstructorInterface constructorInterface = MyClass::new;
		
		MyClass myClass = constructorInterface.construct("Testing");
		System.out.println("string in myClass is " + myClass.getString());

	}

}
