package chapter08_Packages_Interfaces;

public class SeriesDemo2 {

	public static void main(String[] args) {
		ByTwos byTwos = new ByTwos();
		ByThrees byThrees = new ByThrees();
		Series series;

		for (int i = 0; i < 5; i++) {
			series = byTwos;
			System.out.println("Next ByTwos value is " + series.getNext());

			series = byThrees;
			System.out.println("Next ByThrees value is " + series.getNext());
		}

	}

}
