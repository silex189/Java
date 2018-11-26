package samples;

public class Lambdas {
	
	public static void main(String[] args) {
		// Anonymous function implementation
//		OnOneListener oneListener = new OnOneListener() {
//			@Override
//			public void onOne(String message) {
//				System.out.println("No one Lambda: " + message);
//			}
//		};
		
		
		OnOneListener oneListener = (String message) -> {
			System.out.println("One Lambda :) " + message);
		};
		
		oneListener.onOne("Lambda made");
	}

}
