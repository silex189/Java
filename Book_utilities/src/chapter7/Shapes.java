package chapter7;

class TwoDimessionShape {
	private double width, height;

	TwoDimessionShape() {
		width = height = 0.0;
	}

	TwoDimessionShape(double value) {
		width = height = value;
	}

	TwoDimessionShape(double width, double height) {
		this.width = width;
		this.height = height;
	}

	TwoDimessionShape(TwoDimessionShape twoDimessionShape) {
		this.width = twoDimessionShape.getWidth();
		this.height = twoDimessionShape.getHeight();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	void showDimession() {
		System.out.println("Width and height are " + width + " and " + height);
	}

}

class Triangle extends TwoDimessionShape {
	private String style;

	Triangle() {
		super();
		style = "none";
	}

	Triangle(double value) {
		super(value);
		style = "filled";
	}

	Triangle(String style, double height, double width) {
		super(width, height);
		/*setHeight(height);
		setWidth(width);*/
		this.style = style;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + getStyle());
	}
}

class Rectangle extends TwoDimessionShape {
	Rectangle() {
		super();
	}
	
	Rectangle(double value) {
		super(value);
	}

	Rectangle(double width, double height) {
		super(width, height);
	}

	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
}
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
		triangle1.showDimession();
		System.out.println("Area is " + triangle1.area());
		
		System.out.println();

		System.out.println("Info for triangle2: ");
		triangle2.showStyle();
		triangle2.showDimession();
		System.out.println("Area is " + triangle2.area());

		System.out.println();
		triangle3 = triangle4;

		System.out.println("Info for triangle3: ");
		triangle3.showStyle();
		triangle3.showDimession();
		System.out.println("Area is " + triangle3.area());

	}
}
