package chapter7;

public class Triangle extends TwoDimenssionShape {
	private String style;

	Triangle() {
		super();
		style = "none";
	}

	Triangle(double value) {
		super(value,"triangle");
		style = "filled";
	}

	Triangle(String style, double height, double width) {
		super(width, height, "triangle");
		/*setHeight(height);
		setWidth(width);*/
		this.style = style;
	}

	Triangle(Triangle triangle) {
		super(triangle);
		style = triangle.style;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void setStyle(String style) {
		this.style = style;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
