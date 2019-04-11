package chapter12_Enum_Autoboxing_staticImport_annotations;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Quadratic {

	public static void main(String[] args) {
		double a, b, c, x;
		
		//Quadratic equation
		
		a = 4;
		b = 1;
		c = -3;
		
		x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("First solution: " + x);
		
		x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("Second solution: " + x);
		

	}

}
