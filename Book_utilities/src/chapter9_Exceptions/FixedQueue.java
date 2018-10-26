package chapter9_Exceptions;

public class FixedQueue implements InterfaceCharQueueFull {
	private char queue[];
	private int putLocker, getLocker;
	
	

	public FixedQueue(int size) {
		queue = new char[size];
		putLocker = getLocker = 0;
	}

	@Override
	public void put(char ch) 
		throws QueueFullException {
		
		if(putLocker == queue.length) {
			throw new QueueFullException(queue.length);
		}
		
		queue[putLocker++] = ch;

	}

	@Override
	public char get()
			throws QueueEmptyException {
		if(getLocker == putLocker)  {
			throw new QueueEmptyException();
		}
		return queue[getLocker++];
	}

}
