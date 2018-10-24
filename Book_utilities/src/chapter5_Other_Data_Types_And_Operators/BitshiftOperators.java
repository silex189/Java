package chapter5_Other_Data_Types_And_Operators;

public class BitshiftOperators {

	public static void main(String[] args) {
		
		int value = 1;

		for(int i=0; i < 8; i++) {
			for(int t = 128; t > 0; t /= 2) {
				if((value & t) != 0) System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
			value = value << 1;
		}

		System.out.println();

		value = 128;

		for(int i = 0; i < 8; i++) {
			for(int t = 128; t > 0; t /= 2) {
				if((value & t) != 0) System.out.print("1 ");
				else 
					System.out.print("0 ");
			}
			System.out.println();
			value = value >> 1;
		}
		
	}

}
