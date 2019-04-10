package chapter04_Classes_Objects_and_Methods;

class FactorChecker {

	private int factor;
	private int number;

	FactorChecker(int factor, int number){
		this.factor = factor;
		this.number = number;
	}

	private boolean isFactor(int factor, int number) {
		if( (number % factor) == 0) return true;
		else return false;
	}

	public void check() {
		if(isFactor(factor, number))
			System.out.println(factor + " is factor of " + number);
		else
			System.out.println(factor + " is NOT factor of " + number);
	}

}

public class FactorCheckerMain {
	public static void main(String[] args) {

		FactorChecker factorChecker = new FactorChecker(2, 20);
		factorChecker.check();

		factorChecker = new FactorChecker(3, 20);
		factorChecker.check();

		factorChecker = new FactorChecker(6, 20);
		factorChecker.check();

		factorChecker = new FactorChecker(10, 20);
		factorChecker.check();

	}
}
