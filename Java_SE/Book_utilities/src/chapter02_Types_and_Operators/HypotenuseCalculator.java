package chapter02_Types_and_Operators;

public class HypotenuseCalculator {

	public static void main(String[] args) {
		final double SIDE_A, SIDE_B, SIDE_C;
		SIDE_A = 3;
		SIDE_B = 4;
		System.out.println("We've got a triangle with a side A, side B "
							+ "and side C. ");
		System.out.println("Side C is the hypotenuse");
		System.out.println("If side A is 3 cm, and side B is 4, then "
				+ "side C, ");

		SIDE_C = Math.sqrt(SIDE_A * SIDE_A + SIDE_B * SIDE_B);
		System.out.println("hypotenuse is " + SIDE_C);

	}

}
