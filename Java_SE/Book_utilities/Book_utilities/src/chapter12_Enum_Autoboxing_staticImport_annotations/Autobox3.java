package chapter12_Enum_Autoboxing_staticImport_annotations;

public class Autobox3 {

	public static void main(String[] args) {
		Integer integerObject1, integerObject2;
		int i;
		
		integerObject1 = 99;
		System.out.println("Original value of integerObject1: " + integerObject1);
		
		++integerObject1;
		System.out.println("After ++integerObject1: " + integerObject1);
		
		integerObject1 += 10;
		System.out.println("After integerObject += 10: " + integerObject1);
		
		integerObject2 = integerObject1 + (integerObject1 / 3);
		System.out.println("integerObject2 after expression: " + integerObject2);
		
		i = integerObject1 + (integerObject1 / 3);
		System.out.println("i after expression: " + i);
		
		

	}

}
