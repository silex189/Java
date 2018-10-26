package chapter8_Packages_Interfaces;

public class SeriesDemo {

	public static void main(String[] args) {
		ByTwos byTwos = new ByTwos();

		for(int i=0; i < 5; i++) {
			System.out.println("Next value is " + byTwos.getNext());
		}

		System.out.println("\nResetting");
		byTwos.reset();
		for(int i=0; i < 5; i++) {
			System.out.println("Next value is " + byTwos.getNext());
		}

		System.out.println("\nStarting at 100");
		byTwos.setStart(100);
		for(int i=0; i < 5; i++) {
			System.out.println("Next value is " + byTwos.getNext());
		}

	}
}
