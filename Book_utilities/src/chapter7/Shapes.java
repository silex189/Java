package chapter7;

class TwoDimessionShape {
	double width, height;

	void showDimession() {
		System.out.println("Width and height are " + width + " and " + height);
	}

}

class Triangle extends TwoDimessionShape {
	String style;

	double area() {
		return width * height / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}

class Rectangle extends TwoDimessionShape {
	boolean isSquare() {
		if(width == height) return true;
		return false;
	}
}
public class Shapes {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle();

		triangle1.width = 4.0;
		triangle1.height = 4.0;
		triangle1.style = "filled";
		
		triangle2.width = 8.0;
		triangle2.height = 12.0;
		triangle2.style = "outlined";

		System.out.println("Info for triangle1: ");
		triangle1.showStyle();
		triangle1.showDimession();
		System.out.println("Area is " + triangle1.area());
		
		System.out.println();

		System.out.println("Info for triangle2: ");
		triangle2.showStyle();
		triangle2.showDimession();
		System.out.println("Area is " + triangle2.area());

	}
}
