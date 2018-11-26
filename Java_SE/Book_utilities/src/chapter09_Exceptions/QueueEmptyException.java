package chapter09_Exceptions;

public class QueueEmptyException extends Exception {
	
	public String toString() {
		return "\nQueue is empty";
	}

}
