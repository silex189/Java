package chapter8;

public class DynamicQueue implements InterfaceCharQueue {
	private char queue[];
	private int putLocker, getLocker;

	public DynamicQueue(int size) {
		queue = new char[size+1];
		putLocker = getLocker = 0;
	}

	@Override
	public void put(char ch) {
		if(putLocker == queue.length-1) {
			char temporal[] = new char[queue.length * 2];
			for(int i=0; i < queue.length; i++) {
				temporal[i] = queue[i];
			}
			queue = temporal;
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
