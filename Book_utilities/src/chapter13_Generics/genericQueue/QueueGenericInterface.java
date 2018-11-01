package chapter13_Generics.genericQueue;

public interface QueueGenericInterface<T> {
	void put(T object) throws QueueFullException;
	T get() throws QueueEmptyException;

}
