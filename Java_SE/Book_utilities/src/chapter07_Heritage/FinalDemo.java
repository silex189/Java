package chapter07_Heritage;

class ErrorMessage {
	final int OUTERROR = 0;
	final int INERROR = 1;
	final int DISKERROR = 2;
	final int INDEXERROR = 3;

	String messages[] = {
		"Output Error",
		"Input Error",
		"Disk Full",
		"Index Out-Of-Bounds"
	};

	String getErrorMessage(int i) {
		if(i >= 0 & i < messages.length)
			return messages[i];
		else return "Invalid Error Code";
	}

}

public class FinalDemo {

	public static void main(String[] args) {
		ErrorMessage error = new ErrorMessage();
		System.out.println(error.getErrorMessage(error.OUTERROR));
		System.out.println(error.getErrorMessage(error.DISKERROR));

	}

}
