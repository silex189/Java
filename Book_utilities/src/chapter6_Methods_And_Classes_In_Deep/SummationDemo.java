package chapter6_Methods_And_Classes_In_Deep;

class Summation {
	
	private int sum;

	Summation(int num) {
		sum = 0;
		for(int i = 1; i <= num; i++)
		sum += i;
	}

	Summation(Summation summation) {
		sum = summation.sum;
	}
	
	public int getSum() {
		return sum;
	}
}

public class SummationDemo {

	public static void main(String[] args) {
		Summation summation1 = new Summation(5);
		Summation summation2 = new Summation(summation1);

		System.out.println("summation1.sum: " + summation1.getSum());
		System.out.println("summation2.sum: " + summation2.getSum());


	}

}
