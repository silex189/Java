package chapter02_Types_and_Operators;

class CubicInchesCalculator {
	  public static void main(String[] args) {
	    long ci;
	    long im;

	    im = 5280 * 12;
	    ci = im * im * im;

	    System.out.println("There are " + ci +
	                      " cubic inches in cubic mile.");
		}
}