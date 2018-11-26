package chapter02_Types_and_Operators;

public class CharArithmeticalDemo {

	public static void main(String[] args) {
		
		char ch = 'X';
		System.out.println("We've declared ch as: " + ch);

		ch++;
		System.out.println("We've add 1, now ch is " + ch);

		ch = 90;
		System.out.println("We've declared ch as 90 in decimal, "
							+ "now ch is equal to " + ch);

		ch = (char) (ch - 3);
		System.out.println("We've substracted 3 to ch, now ch"
											+ " is " + ch);

	}

}
