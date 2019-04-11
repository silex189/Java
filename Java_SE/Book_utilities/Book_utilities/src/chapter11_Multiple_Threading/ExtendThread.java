package chapter11_Multiple_Threading;

public class ExtendThread {

	public static void main(String[] args) {
		System.out.println("Main thread starting");
		ExtendMyThread extendMyThread = new ExtendMyThread("Child #1");

		for(int i=0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exception) {
				System.out.println("Main thread interrupted");
			}
		}

		System.out.println("Main thread ending");
	}

}
