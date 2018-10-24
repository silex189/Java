package chapter6_Methods_And_Classes_In_Deep;

public class ControledArrayMain {

	public static void main(String[] args) {
		ControledArray controledArray = new ControledArray(5, -1);
		int arrayValue;

		System.out.println("Fail quietly");
		for(int i = 0; i < (controledArray.length * 2); i++)
			controledArray.put(i, i * 10);

		for(int i = 0; i < (controledArray.length * 2); i++) {
			arrayValue = controledArray.get(i);
			if(arrayValue != -1) System.out.print(arrayValue + " ");
		}

		System.out.println("");

		System.out.println("\nFail with error reports.");
		for(int i = 0; i < (controledArray.length * 2); i++) 
			if(!controledArray.put(i, i * 10))
				System.out.println("Index " + i + " out-of-bounds");

		for(int i = 0; i < (controledArray.length * 2); i++) {
			arrayValue = controledArray.get(i);
			if(arrayValue != -1) System.out.print(arrayValue + " ");
			else
				System.out.println("Index " + i + " out-of-bounds");
		}
	}
}