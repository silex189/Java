package chapter6;

class Error {
	private String message;
	private int severity;

	Error(String message, int severity) {
		this.message = message;
		this.severity = severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getSeverity() {
		return severity;
	}
}

class ErrorInfo {
	private String messages[] = {
		"Output Error",
		"Input Error",
		"Disk Full",
		"Index Out-Of-Bounds"
	};

	private int howBad[] = { 3, 3, 2, 4 };

	Error getErrorInfo(int i) {
		if(i >= 0 & i < messages.length)
			return new Error(messages[i], howBad[i]);
		else
			return new Error("Invalid Error Code", 0);
	}
}

public class ReturningObjectDemo {

	public static void main(String[] args) {
		ErrorInfo errorInfo = new ErrorInfo();
		Error error;

		error = errorInfo.getErrorInfo(2);
		System.out.println(error.getMessage() + " severity: " + error.getSeverity());

		error = errorInfo.getErrorInfo(19);
		System.out.println(error.getMessage() + " severity: " + error.getSeverity());
	}
}
