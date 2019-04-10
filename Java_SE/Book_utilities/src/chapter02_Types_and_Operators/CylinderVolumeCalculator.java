package chapter02_Types_and_Operators;

public class CylinderVolumeCalculator {

	public static void main(String[] args) {
		
		final double RADIUS = 4, HEIGHT = 5;
		System.out.println("We gonna calculate a cylinder volumen.");
		System.out.println("Cylinder's radius is " + RADIUS);
		System.out.println("Cylinder's height is " + HEIGHT + "\n");
		System.out.println("Therefore, to find out the volume "
											+ "the operation is :");
		System.out.println("Volume = 3.1416 * radius * radius * height\n");
		System.out.print("So, volume of a Cylinder its have a "
										+ "4 cm radius and 5 cm height is ");
		
		final double VOLUME = 3.1416 * RADIUS * RADIUS * HEIGHT;
		System.out.print(VOLUME);
	}

}
