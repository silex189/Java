package chapter8_Packages_Interfaces;

public class InterfaceQueueDemo {

	public static void main(String[] args) {
		FixedQueue fixedQueue = new FixedQueue(10);
		DynamicQueue dynamicQueue = new DynamicQueue(5);
		CircularQueue circularQueue = new CircularQueue(10);

		InterfaceCharQueue interfaceCharQueue;

		char ch;
		int i;

		interfaceCharQueue = fixedQueue;
		for(i=0; i < 10; i++) {
			interfaceCharQueue.put((char) ('A' + i));
		}

		System.out.print("Contents of fixed queue: ");
		for(i=0;  i < 10; i++) {
			ch = interfaceCharQueue.get();
			System.out.print(ch);
		}
		System.out.println();

		interfaceCharQueue = dynamicQueue;
		for(i=0; i < 10; i++) {
			interfaceCharQueue.put((char) ('Z' - i));
		}

		System.out.print("Contentns of Dynamic queue: ");
		for(i=0; i < 10; i++) {
			ch = interfaceCharQueue.get();
			System.out.print(ch);
		}

		System.out.println();

		interfaceCharQueue = circularQueue;
		for(i=0; i < 10; i++) {
			interfaceCharQueue.put((char) ('A' + i));
		}

		System.out.print("Contents of circular queue: ");
		for(i=0; i < 10; i++) {
			ch = interfaceCharQueue.get();
			System.out.print(ch);
		}

		System.out.println();

		for(i=10; i < 20; i++) {
			interfaceCharQueue.put((char) ('A' + i));
		}

		System.out.print("Contents of circular queue: ");
		for(i=0; i < 10; i++) {
			ch = interfaceCharQueue.get();
			System.out.print(ch);
		}

		System.out.print("\nStore and consume from circular queue: \n");
		for(i=0; i < 20; i++) {
			interfaceCharQueue.put((char) ('A' + i));
			ch = interfaceCharQueue.get();
			System.out.print(ch);
		}



	}

}
