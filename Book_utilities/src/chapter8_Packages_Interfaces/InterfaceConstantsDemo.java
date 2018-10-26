package chapter8_Packages_Interfaces;

interface InterfaceWithConstants {
	int MIN = 0;
	int MAX = 10;
	String ERRORMESSAGE = "Boundary Error";
}

public class InterfaceConstantsDemo implements InterfaceWithConstants {

	public static void main(String[] args) {
		int nums[] = new int[MAX];

		for (int i = MIN; i < 11; i++) {
			if (i >= MAX)
				System.out.println(ERRORMESSAGE);
			else {
				nums[i] = i;
				System.out.print(nums[i] + " ");
			}
		}
	}

}
