package chapter5;

public class BitwiseOperatorsTable {

	public static void main(String[] args) {
		
		byte p, q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		p = 0; q = 0;
		System.out.print(p + "\t" + q + "\t");
		System.out.print( ((byte) (p&q)) + "\t" + ((byte) (p|q)) + "\t");
		System.out.println( ((byte) (p^q)) + "\t" + ((byte) (~p)));
		p = 1; q = 0;
		System.out.print(p + "\t" + q + "\t");
		System.out.print( ((byte) (p&q)) + "\t" + ((byte) (p|q)) + "\t");
		System.out.println( ((byte) (p^q)) + "\t" + ((byte) (~p)));
		p = 0; q = 1;
		System.out.print(p + "\t" + q + "\t");
		System.out.print( ((byte) (p&q)) + "\t" + ((byte) (p|q)) + "\t");
		System.out.println( ((byte) (p^q)) + "\t" + ((byte) (~p)));
		p = 1; q = 1;
		System.out.print(p + "\t" + q + "\t");
		System.out.print( ((byte) (p&q)) + "\t" + ((byte) (p|q)) + "\t");
		System.out.println( ((byte) (p^q)) + "\t" + ((byte) (~p)));


	}

}
