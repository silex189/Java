package chapter2_Types_and_Operators;

public class CylinderVolumeCalculator {

	public static void main(String[] args) {
		
		double radius = 4, height = 5;
		System.out.println("We gonna calculate a cylinder volumen.");
		System.out.println("Cylinder's radius is " + radius);
		System.out.println("Cylinder's height is " + height + "\n");
		System.out.println("Therefore, to find out the volume "
											+ "the operation is :");
		System.out.println("Volume = 3.1416 * radius * radius * height\n");
		System.out.print("So, volume of a Cylinder its have a "
										+ "4 cm radius and 5 cm height is ");
		
		double volume = 3.1416 * radius * radius * height;
		System.out.print(volume);
	}

}
