package chapter7;

public class TwoDimenssionShape {

	private double width, height;

	TwoDimenssionShape() {
		width = height = 0.0;
	}

	TwoDimenssionShape(double value) {
		width = height = value;
	}

	TwoDimenssionShape(double width, double height) {
		this.width = width;
		this.height = height;
	}

	TwoDimenssionShape(TwoDimenssionShape twoDimenssionShape) {
		this.width = twoDimenssionShape.getWidth();
		this.height = twoDimenssionShape.getHeight();
	}

	public double getWidth() { return width; }

	public void setWidth(double width) { this.width = width; }

	public double getHeight() { return height; }

	public void setHeight(double height) { this.height = height; }

	void showDimenssion() {
		System.out.println("Width and height are " + width + " and " + height);
	}

}
