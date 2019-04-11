package chapter02_Types_and_Operators;

public class SideEffects {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int i = 0;
		System.out.println("Now 'i' is: " + i);
		
		if(false &  (++i < 100)) // & evaluate the full expression, having an increse in i
			System.out.println("this won't be displayed");
			
		System.out.println("Now 'i' is: " + i);


		if(false && (++i < 100)) //&& stops the evaluation
			System.out.println("this won't be displayed");
			
		System.out.println("Now 'i' is still: " + i);
	}
}
