package test.java.auxiliar.withoutJUnit;

public class ClazzExample {

	public void method1(){
		System.out.println("method1 invoked");
	}
	
	public void method2(){
		System.out.println("method2 invoked");
	}
	
	@AnnotationExample
	public void method3(){
		System.out.println("method3 invoked");
	}
	
	
	public void method4(){
		System.out.println("method4 invoked");
	}
}
