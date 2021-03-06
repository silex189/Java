package chapter04_Classes_Objects_and_Methods;

class EvenChecker {

	private int number;

	public EvenChecker(int number) {
		this.number = number;
	}

	private boolean isEven(int number){
		if((number % 2) == 0) return true;
		
		else return false;
	}

	public void check() {
		if(isEven(number)) System.out.println(number + " is even");
		
		else System.out.println(number + " is not even");
	}

}



public class EvenCheckerMain {
	public static void main(String[] args) {
		
		int counter = 0;

		EvenChecker evenChecker = new EvenChecker(8);
		evenChecker.check();

		evenChecker = new EvenChecker(9);
		evenChecker.check();

		evenChecker = new EvenChecker(10);
		evenChecker.check();
		
		System.out.println();

		for(int i = 20; i <= 100; i += 3) {
			evenChecker = new EvenChecker(i);
			evenChecker.check();

			if(counter == 5) {
				System.out.println();
				counter = 0;
			}
			
			counter++;
		}
		
	}
}
