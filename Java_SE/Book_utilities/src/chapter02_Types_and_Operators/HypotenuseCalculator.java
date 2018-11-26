package chapter02_Types_and_Operators;

public class HypotenuseCalculator {

	public static void main(String[] args) {
		double sideA, sideB, sideC;
		sideA = 3;
		sideB = 4;
		System.out.println("We've got a triangle with a side A, side B "
							+ "and side C. ");
		System.out.println("Side C is the hypotenuse");
		System.out.println("If side A is 3 cm, and side B is 4, then "
				+ "side C, ");

		sideC = Math.sqrt(sideA * sideA + sideB *sideB);
		System.out.println("hypotenuse is " + sideC);

	}

}
