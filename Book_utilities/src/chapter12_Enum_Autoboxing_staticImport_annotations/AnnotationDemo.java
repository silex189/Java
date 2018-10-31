package chapter12_Enum_Autoboxing_staticImport_annotations;

@Deprecated
class MyClass {
	private String message;
	
	MyClass(String message) {
		this.message = message;
	}
	
	@Deprecated
	String getMessage() {
		return message;
	}
}


public class AnnotationDemo {

	public static void main(String[] args) {
		MyClass myClass = new MyClass("test");
		
		System.out.println(myClass.getMessage());

	}

}
