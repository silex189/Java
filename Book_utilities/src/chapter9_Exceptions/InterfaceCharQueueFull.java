package chapter9_Exceptions;

public interface InterfaceCharQueueFull {
	void put(char ch) throws QueueFullException;
	char get() throws QueueEmptyException;

}
