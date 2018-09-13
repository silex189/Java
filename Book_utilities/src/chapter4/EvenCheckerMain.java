package chapter4;

class EvenChecker {

	int number;

	EvenChecker(int number) {
		this.number = number;
	}

	boolean isEven(int number){
		if((number % 2) == 0)
			return true;
		else return false;
	}

	void checker() {
		if(isEven(number))
			System.out.println(number + " is even");
		else System.out.println(number + " is not even");
	}

}



public class EvenCheckerMain {
	public static void main(String[] args) {
		
		int counter = 0;

		EvenChecker evenChecker = new EvenChecker(8);
		evenChecker.checker();

		evenChecker = new EvenChecker(9);
		evenChecker.checker();

		evenChecker = new EvenChecker(10);
		evenChecker.checker();
		
		System.out.println();

		for(int i = 20; i <= 100; i += 3) {
			evenChecker = new EvenChecker(i);
			evenChecker.checker();
			if(counter == 5) {
				System.out.println();
				counter = 0;
			} else counter++;
		}
	}
}
