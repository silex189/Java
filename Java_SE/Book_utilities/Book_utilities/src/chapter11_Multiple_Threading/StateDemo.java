package chapter11_Multiple_Threading;

public class StateDemo {

	public static void main(String[] args) {
		MyThreadState myThreadState = new MyThreadState("My Thread");

		try {
			Thread.sleep(1000);

			myThreadState.mySuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);

			myThreadState.myResume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);

			myThreadState.mySuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);

			myThreadState.myResume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);

			myThreadState.mySuspend();
			System.out.println("Stopping thread.");
			myThreadState.myStop();

		} catch (InterruptedException exception) {
			System.out.println("Main thread Interrupted");
		}

		try {
			myThreadState.thread.join();
		} catch (InterruptedException exception) {
			System.out.println("Main thread Interrupted");
		}

		System.out.println("Main thread exiting.");

	}

}
