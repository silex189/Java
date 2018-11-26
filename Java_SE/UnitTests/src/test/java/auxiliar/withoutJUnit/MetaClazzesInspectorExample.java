package test.java.auxiliar.withoutJUnit;

import java.io.File;

public class MetaClazzesInspectorExample {

	public static void main(String[] args){
		File directory = new File("d:\\Git\\JUnit\\src\\test\\java\\auxiliar\\withoutJUnit");
		String[] clazzes = directory.list();
		for(String clazz : clazzes) {
			System.out.println(clazz);
		}		
	}
}
