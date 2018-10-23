package chapter7;

public class Shapes2 {

	public static void main(String[] args) {

		ColorTriangle colorTriangle1 = new ColorTriangle("Blue", "outlined", 8.0, 12.0);
		ColorTriangle colorTriangle2 = new ColorTriangle("Red", "filled", 2.0, 2.0);

		System.out.println("Info for colorTriangle1: ");
		colorTriangle1.showStyle();
		colorTriangle1.showDimenssion();
		colorTriangle1.showColor();
		System.out.println("Area is " + colorTriangle1.area());

		System.out.println();

		System.out.println("Info for colorTriangle2: ");
		colorTriangle2.showStyle();
		colorTriangle2.showDimenssion();
		colorTriangle2.showColor();
		System.out.println("Area is " + colorTriangle2.area());

	}

}
