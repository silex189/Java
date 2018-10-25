package chapter8;

public class CircularQueue implements InterfaceCharQueue {
	private char queue[];
	private int putLocker, getLocker;

	public CircularQueue(int size) {
		queue = new char[size+1];
		putLocker = getLocker = 0;
	}

	@Override
	public void put(char ch) {
		if(putLocker+1 == getLocker | ((putLocker == queue.length-1) & (getLocker == 0))) {
			System.out.println(" --- Queue is full");
			return;
		}
		queue[putLocker++] = ch;
		if(putLocker == queue.length) putLocker = 0;
	}

	@Override
	public char get() {
		if(getLocker == putLocker) {
			System.out.println(" --- Queue is empty");
			return (char) 0;
		}
		char ch = queue[getLocker];
		if(getLocker == queue.length) {
			getLocker = 0;
		}
		return queue[getLocker];
	}

}
