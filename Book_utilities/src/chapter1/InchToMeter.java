package chapter1;

public class InchToMeter {

	public static void main(String[] args) {
		System.out.println("We are going to show 12 foot in inches");
		System.out.println("12 foots are 144 inches");
		System.out.println("Let's start the counting");
		
		double inches, meters;
		int counter = 0;
		
		for(inches = 1; inches <= 144; inches++) {
			meters = inches / 39.37;  // convert inches to meters
			
			System.out.println(inches + " inches are " + meters + " meters");
			
			counter++;
			
			if(counter >= 12) {
				System.out.println();
				counter = 0;
			}
		}
		

	}

}
