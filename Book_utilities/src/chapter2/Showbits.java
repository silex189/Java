package chapter2;

public class Showbits {

	public static void main(String[] args) {
		
		// show a decimal number in binary
		int bits;
		byte value = 123; // value of decimal
		
		for(bits=128; bits > 0; bits = bits/2){
			if((value & bits) != 0) System.out.print("1");
			else System.out.print("0");	
		}
	}
}
