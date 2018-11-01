package chapter13_Generics.genericQueue;

public class QueueEmptyException extends Exception {
	
	public String toString() {
		return "\nQueue is empty.";
	}

}
