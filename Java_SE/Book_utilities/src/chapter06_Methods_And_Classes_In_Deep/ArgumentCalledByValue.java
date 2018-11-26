package chapter06_Methods_And_Classes_In_Deep;

class CallByValue {

	void noChangeArguments(int i, int j) {
		i = i + j;
		j = -j;
	}
}

public class ArgumentCalledByValue {

	public static void main(String[] args) {
		CallByValue callByValue = new CallByValue();

		int i = 15, j = 20;

		System.out.println("i and j before call: " + i + " " + j);
		callByValue.noChangeArguments(i, j);
		System.out.println("i and j after call: " + i + " " + j);

	}

}
