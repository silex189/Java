package chapter02_Types_and_Operators;

class CubicInchesCalculator {
	  public static void main(String[] args) {
	    final long CUBIC_INCHES;
	    final long IM;

	    IM = 5280 * 12;
	    CUBIC_INCHES = IM * IM * IM;

	    System.out.println("There are " + CUBIC_INCHES +
	                      " cubic inches in cubic mile.");
		}
}