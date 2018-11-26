package chapter13_Generics.genericQueue;

public class GenericQueue<T> implements QueueGenericInterface<T> {
	private T queue[];
	private int putLocker, getLocker;
	
	public GenericQueue(T[] queue) {
		this.queue = queue;
		putLocker = getLocker = 0;
	}
	

	@Override
	public void put(T object) throws QueueFullException {
			
			if (putLocker == queue.length-1)
				throw new QueueFullException(queue.length-1);
			
			queue[putLocker++] = object;
		}
		
	@Override
	public T get() throws QueueEmptyException {
		
		if (getLocker == putLocker)
			throw new QueueEmptyException();
		
		
		return queue[getLocker++];
	}

}
