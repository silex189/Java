package chapter01_Concepts;

public class MoonWeightCalculator {

	public static void main(String[] args) {
		
		final int EARTH_WEIGHT = 80;
		final int MOON_WEIGHT =  (15 * EARTH_WEIGHT) / 100;
		
		System.out.println("My current weight is " + EARTH_WEIGHT);
		System.out.println("My weight in the moon is: " + MOON_WEIGHT);



	}

}
