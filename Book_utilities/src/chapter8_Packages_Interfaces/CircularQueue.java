package chapter8_Packages_Interfaces;

import chapter6_Methods_And_Classes_In_Deep.Queue;

public class CircularQueue implements InterfaceCharQueue {
	private char arrayQueue[];
	private int putLocker, getLocker;

	public CircularQueue(int size) {
		arrayQueue = new char[size];
		putLocker = getLocker = 0;
	}

	@Override
/*	public void put(char ch) {
		if(putLocker+1 == getLocker | ((putLocker == arrayQueue.length-1) & (getLocker == 0))) {
			System.out.println(" --- Queue is full");
			return;
		} else {
				arrayQueue[putLocker] = ch;
				putLocker++;
				if(putLocker == arrayQueue.length) putLocker = 0;
		}
	}*/

	public void put(char ch) {
		arrayQueue[putLocker] = ch;
		if(putLocker+1 == arrayQueue.length) {
			//System.out.println("A round");
			putLocker = 0;
		} else {
			putLocker++;
		}
	}

	private boolean test(){
		return false;}

	@Override

	public char get() {
/*		if(getLocker == (arrayQueue.length - arrayQueue.length)) {
			System.out.println(" --- Inside get");
			return (char) 0;
		} else {
		*/if(getLocker == arrayQueue.length) {
			getLocker = 0;
		}
		int tmpGetLocker;
		tmpGetLocker = getLocker;
		getLocker++;
		return arrayQueue[tmpGetLocker];
		//}
	}

}
