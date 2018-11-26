package chapter13_Generics.genericQueue;

public class QueueFullException extends Exception {
	int size;
	
	public QueueFullException(int size) {
		this.size = size;
	}
	
	public String toString() {
		return "\nQueue is full. Maximum size is " + size;
	}

}
