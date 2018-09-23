package chapter5;

public class BitwiseNotDemo {

	public static void main(String[] args) {
		
		byte byteValue = -34;

		for(int t=128; t > 0; t = t/2) {
			if((byteValue & t) != 0) System.out.print("1 ");
			else System.out.print("0 ");
		}

		System.out.println();

		byteValue = (byte) ~byteValue;

		for(int t=128; t > 0; t /= 2) {
			if( (byteValue & t) != 0 ) System.out.print("1 ");
			else System.out.print("0 ");
		}

		

	}

}
