package chapter11_Multiple_Threading;

class MyThreadImproved implements Runnable {
  Thread thread;

	MyThreadImproved(String threadName) {
    thread = new Thread(this, threadName);
    thread.start();
	}

	public void run() {
		System.out.println(thread.getName() + " starting.");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thread.getName() + ", count is " + count);
			}
		} catch (InterruptedException exception) {
			System.out.println(thread.getName() + " interrupted.");
		}
		System.out.println(thread.getName() + " terminating.");
	}

}