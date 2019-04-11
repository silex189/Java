package chapter04_Classes_Objects_and_Methods;

class FinalizeDemo {

	private int counter;

	public FinalizeDemo(int counter) {
		this.counter = counter;
	}

	protected void finalize() {
		System.out.println("Finilizing " + counter);
	}

	void generator(int object) {
		FinalizeDemo currentFinalizeDemo = new FinalizeDemo(object);
	}

}

public class Finalize {
	public static void main(String[] args) {

		FinalizeDemo finalizeDemo = new FinalizeDemo(0);

		for (int object = 1; object < 10000000; object++)
			finalizeDemo.generator(object);

	}
}
