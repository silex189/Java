package chapter07_Heritage;

public class Rectangle extends TwoDimenssionShape {
	Rectangle() {
		super();
	}
	
	Rectangle(double value) {
		super(value, "rectangle");
	}

	Rectangle(double width, double height) {
		super(width, height, "rectangle");
	}

	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}

	double area() {
		return getWidth() * getHeight();
	}
}
