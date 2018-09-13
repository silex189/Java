package chapter4;

class Help {

	void helpOn(int what) {
		switch(what) {
			case '1':
				System.out.println("The if:\n");
				System.out.println("if(condition) statement");
				System.out.println("else if (condition) statement");
				System.out.println("else statement");
				break;
			case '2':
				System.out.println("The switch:\n");
				System.out.println("switch(expression) {");
				System.out.println(" case constant:");
				System.out.println(" statement sequence");
				System.out.println(" breack;");
				System.out.println(" // ...");
				System.out.println("}");
				break;
			case '3':
				System.out.println("The for:\n");
				System.out.println("for(init; condition; iteration)");
				System.out.println(" statement");
				break;
			case '4':
				System.out.println("The while:\n");
				System.out.println("while(condition) statment");
				break;
			case '5':
				System.out.println("The do-while:\n");
				System.out.println("do {");
				System.out.println(" statement");
				System.out.println("while(condition);");
				break;
			case '6':
				System.out.println("The break:\n");
				System.out.println("break; or break label;");
				break;
			case '7':
				System.out.println("The continue:\n");
				System.out.println("continue; or continue label;");
				break;
			/*default:
				System.out.println("Selection not found, try again");*/
		}
			System.out.println();
	}

	void showMenu() {
		System.out.println("Help on: ");
		System.out.println(" 1. if");
		System.out.println(" 2. switch");
		System.out.println(" 3. for");
		System.out.println(" 4. while");
		System.out.println(" 5. do-while");
		System.out.println(" 6. break");
		System.out.println(" 7. continue");
		System.out.print("Choose one (q to quit) : ");
	}

	boolean isValid(int character) {
		if(character < '1' | character > '7' & character != 'q') {
			System.out.println("\nSelection not found, try again\n");
			return true;
		} 
		else return false;
	}

}

public class HelpMain {

	public static void main(String[] args) 
		throws java.io.IOException {

			
			Help help = new Help();
			char choice, ignore;

			for(;;) {
				do {
					help.showMenu();
					choice = (char) System.in.read();
					do {
						ignore = (char) System.in.read();
					} while(ignore != '\n');

				} while(help.isValid(choice));
				
				if(choice == 'q') break;

				System.out.println("\n");
				
				//System.out.println("\n");

				help.helpOn(choice);
			}
			

	}

}
