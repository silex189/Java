package chapter7;

public abstract class TwoDimenssionShape {

	private double width, height;
	private String name;

	TwoDimenssionShape() {
		width = height = 0.0;
		name = "none";
	}

	TwoDimenssionShape(double value, String name) {
		width = height = value;
		this.name = name;
	}

	TwoDimenssionShape(double width, double height, String name) {
		this.width = width;
		this.height = height;
		this.name = name;
	}

	TwoDimenssionShape(TwoDimenssionShape twoDimenssionShape) {
		this.width = twoDimenssionShape.getWidth();
		this.height = twoDimenssionShape.getHeight();
		this.name = twoDimenssionShape.getName();
	}

	public double getWidth() { return width; }

	public void setWidth(double width) { this.width = width; }

	public double getHeight() { return height; }

	public void setHeight(double height) { this.height = height; }

	public String getName() { return name; };

	void showDimenssion() {
		System.out.println("Width and height are " + width + " and " + height);
	}

	abstract double area();

}
