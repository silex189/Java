package chapter07_Heritage;

public class ColorTriangle extends Triangle {
	private String color;

	ColorTriangle() {
		super();
		color = "none";
	}

	ColorTriangle(double value) {
		super(value);
		color = "grey";
	}

	ColorTriangle(String color, String style, double width, double height) {
		super(style, height, width);
		this.color = color;
	}

	ColorTriangle(ColorTriangle colorTriangle) {
		super(colorTriangle);
		color = colorTriangle.color;
	}

	String getColor() {
		return color;
	}

	void showColor() {
		System.out.println("color is " + color);
	}
}
