package chapter11_Multiple_Threading;

public class TickTockDemo {

	public static void main(String[] args) {
		TickTock tickTock = new TickTock();
		MyThreadTickTock myThreadTickTock1 = new MyThreadTickTock("Tick", tickTock);
		MyThreadTickTock myThreadTickTock2 = new MyThreadTickTock("Tock", tickTock);

		try {
			myThreadTickTock1.thread.join();
			myThreadTickTock2.thread.join();
		} catch (InterruptedException exception) {
			System.out.println("Main thread interrupted.");
		}

	}

}
