package chapter11_Multiple_Threading;

public class PriorizedThreadsDemo {

	public static void main(String[] args) {
		PriorizedThreads priorizedThreads1 = new PriorizedThreads("High Priority");
		PriorizedThreads priorizedThreads2 = new PriorizedThreads("Low Priority");

		priorizedThreads1.thread.setPriority(Thread.NORM_PRIORITY+2);
		priorizedThreads2.thread.setPriority(Thread.NORM_PRIORITY-2);

		priorizedThreads1.thread.start();
		priorizedThreads2.thread.start();

		try {
			priorizedThreads1.thread.join();
			priorizedThreads2.thread.join();
	
		} catch (InterruptedException exception) {
			System.out.println("Main thread interrupted.");
		}

		System.out.println("\nHigh priority thread counted to " + priorizedThreads1.count);
		System.out.println("\nLow priority thread counted to " + priorizedThreads2.count);
	}

}
