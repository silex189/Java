package chapter05_Other_Data_Types_And_Operators;

class ShowBits {

	int numberBits;

	ShowBits(int numberBits) {
		this.numberBits = numberBits;
	}

	void show(long value) {
		long mask = 1;
		mask <<= numberBits-1;
		
		int spacer = 0;
		for(; mask != 0; mask >>>= 1) {
			if((value & mask) != 0) System.out.print("1 ");
			else	System.out.print("0 ");
			spacer++;
			if((spacer % 8) == 0) {
				System.out.print(" ");
				spacer = 0;
			}
		}
		System.out.println();

	}

}
	
public class ShowBitsTool {
	public static void main(String[] args) {
		ShowBits b = new ShowBits(8);
		ShowBits i = new ShowBits(32);
		ShowBits li = new ShowBits(64);

		System.out.println("123 in binary: ");
		b.show(123);
	
		System.out.println("\n87987 in binary: ");
		i.show(87987);

		System.out.println("\n237658768 in binary: ");
		li.show(237658768);

		System.out.println("\nLow order 8 bits of 87987 in binary: ");
		b.show(87987);
		

	}
}
