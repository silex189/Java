package chapter07_Heritage;

public class Shapes3 {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle("outlined", 8.0, 12.0);
		Triangle triangle2 = new Triangle(triangle1);

		System.out.println("Info for triangle1: ");
		triangle1.showStyle();;
		triangle1.showDimenssion();
		System.out.println("Area is " + triangle1.area());

		System.out.println();

		System.out.println("Info for triangle2: ");
		triangle2.showStyle();
		triangle2.showDimenssion();
		System.out.println("Area is " + triangle2.area());

	}

}
