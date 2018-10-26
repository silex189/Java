package chapter8_Packages_Interfaces;

public class DynamicQueue implements InterfaceCharQueue {
	private char arrayQueue[];
	private int putLocker, getLocker;

	public DynamicQueue(int size) {
		arrayQueue = new char[size];
		putLocker = getLocker = 0;
	}

	@Override
	public void put(char character) {
		if(putLocker == arrayQueue.length) {
			char temporal[] = new char[arrayQueue.length * 2];
			for(int i=0; i < arrayQueue.length; i++) {
				temporal[i] = arrayQueue[i];
			}
			arrayQueue = temporal;
		}
		arrayQueue[putLocker++] = character;
	}

	@Override
	public char get() {
		if(getLocker == putLocker) {
			System.out.println(" -- Queue is empty.");
			return (char) 0;
		}
		return arrayQueue[getLocker++];
	}
}
