package chapter3_Control_Instructions;

public class BreakAsGoTo2 {

	public static void main(String[] args) {
		
done:
					for(int i=0; i<10; i++) {
						for(int j=0; j<10; j++){
							for(int k=0; k<10; k++){
								System.out.println(k + " ");
								if(k == 5) break done;
							}
							System.out.println("After k loop"); //dead code
						}
						System.out.println("After j loop"); // dead code
					}
					System.out.println("After i loop");

	}

}
