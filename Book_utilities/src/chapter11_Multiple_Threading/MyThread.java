package chapter11_Multiple_Threading;

class MyThread implements Runnable {

	String threadName;

	MyThread(String threadName) {
		this.threadName = threadName;
	}

	public void run() {
		System.out.println(threadName + " starting.");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + threadName + ", count is " + count);
			}
		} catch (InterruptedException exception) {
			System.out.println(threadName + " interrupted.");
		}
		System.out.println(threadName + " terminating.");
	}

}
