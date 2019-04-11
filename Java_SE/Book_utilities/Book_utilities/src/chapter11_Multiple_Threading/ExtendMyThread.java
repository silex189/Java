package chapter11_Multiple_Threading;

class ExtendMyThread extends Thread {


	ExtendMyThread(String threadName) {
		super(threadName);
		start();
	}

	public void run() {
		System.out.println(getName() + " starting.");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + getName() + ", count is " + count);
			}
		} catch (InterruptedException exception) {
			System.out.println(getName() + " interrupted.");
		}
		System.out.println(getName() + " terminating.");
	}

}
