package chapter7;

public class Rectangle extends TwoDimenssionShape {
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
