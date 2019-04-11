package chapter05_Other_Data_Types_And_Operators;

public class BitwiseOperatorsTable {
	public static void main(String[] args) {
		
		byte p, q;
		// FIRST ROW
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		p = 0; q = 0;
		// SECOND ROW
		System.out.print(p + "\t" + q + "\t");
		System.out.print( ((byte) (p&q)) + "\t" + ((byte) (p|q)) + "\t");
		System.out.println( ((byte) (p^q)) + "\t" + ((byte) (~p)));
		
		p = 1; q = 0;
		// THIRD ROW
		System.out.print(p + "\t" + q + "\t");
		System.out.print( ((byte) (p&q)) + "\t" + ((byte) (p|q)) + "\t");
		System.out.println( ((byte) (p^q)) + "\t" + ((byte) (~p)));
		
		p = 0; q = 1;
		// FOURTH ROW
		System.out.print(p + "\t" + q + "\t");
		System.out.print( ((byte) (p&q)) + "\t" + ((byte) (p|q)) + "\t");
		System.out.println( ((byte) (p^q)) + "\t" + ((byte) (~p)));
		
		p = 1; q = 1;
		// FIFTH ROW
		System.out.print(p + "\t" + q + "\t");
		System.out.print( ((byte) (p&q)) + "\t" + ((byte) (p|q)) + "\t");
		System.out.println( ((byte) (p^q)) + "\t" + ((byte) (~p)));

	}
}
