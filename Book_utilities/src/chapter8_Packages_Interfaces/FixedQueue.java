package chapter8_Packages_Interfaces;

public class FixedQueue implements InterfaceCharQueue {
	private char queue[];
	private int putLocker, getLocker;
	
	

	public FixedQueue(int size) {
		queue = new char[size];
		putLocker = getLocker = 0;
	}

	@Override
	public void put(char ch) {
		if(putLocker == queue.length) {
			System.out.println(" --- Queue is full.");
			return;
		}
		
		queue[putLocker++] = ch;

	}

	@Override
	public char get() {
		if(getLocker == putLocker) {
			System.out.println(" -- Queue is empty.");
			return (char) 0;
		}
		return queue[getLocker++];
	}

}
