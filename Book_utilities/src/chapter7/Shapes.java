package chapter7;

public class Shapes {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle("filled", 4.0, 4.0);
		Triangle triangle2 = new Triangle("outlined", 8.0, 12.0);
		Triangle triangle3 = new Triangle();
		Triangle triangle4 = new Triangle(4.0);

		/*triangle1.setWidth(4.0);
		triangle1.setHeight(4.0);
		triangle1.setStyle("filled");
		
		triangle2.setWidth(8.0);
		triangle2.setHeight(12.0);
		triangle2.setStyle("outlined");*/


		System.out.println("Info for triangle1: ");
		triangle1.showStyle();
		triangle1.showDimenssion();
		System.out.println("Area is " + triangle1.area());
		
		System.out.println();

		System.out.println("Info for triangle2: ");
		triangle2.showStyle();
		triangle2.showDimenssion();
		System.out.println("Area is " + triangle2.area());

		System.out.println();
		triangle3 = triangle4;

		System.out.println("Info for triangle3: ");
		triangle3.showStyle();
		triangle3.showDimenssion();
		System.out.println("Area is " + triangle3.area());
	}
}
