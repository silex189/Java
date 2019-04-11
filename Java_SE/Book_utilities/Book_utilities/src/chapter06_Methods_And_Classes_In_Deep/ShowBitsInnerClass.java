package chapter06_Methods_And_Classes_In_Deep;

public class ShowBitsInnerClass {
	public static void main(String[] args) {
		
		class ShowBits {
			private int numbits;

			ShowBits(int numbits) {
				this.numbits = numbits;
			}

			void show(long value) {
				long mask = 1;
				mask <<= numbits-1;

				int spacer = 0;
				
				for(; mask != 0; mask >>>= 1) {
					if((value & mask) != 0) System.out.print("1");
					else System.out.print("0");
					
					spacer++;
					
					if((spacer & 8) == 0) { // bitwise AND
						System.out.print(" ");
						spacer = 0;
					}
				}
				System.out.println();
			}

		}

		ShowBits bytevalue = new ShowBits(8);
		
		for(byte b = 0; b < 10; b++) {
			System.out.print(b + " in binary: ");
			bytevalue.show(b);
		}


	}
}
