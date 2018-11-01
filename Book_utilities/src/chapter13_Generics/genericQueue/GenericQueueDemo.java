package chapter13_Generics.genericQueue;

public class GenericQueueDemo {

	public static void main(String[] args) {
		Integer integerStore[] = new Integer[10];
		GenericQueue<Integer> genericQueueInteger = new GenericQueue<Integer>(integerStore);
		
		Integer integerValue;
		
		System.out.println("Demonstrate a queue of Integers.");
		try {
			for (int i=0; i < 5; i++) {
				System.out.println("Adding " + i + " to the genericQueue.");
				genericQueueInteger.put(i);
			}
			
		} catch (QueueFullException exception) {
			System.out.println(exception);
		}
		
		System.out.println();
		
		try {
			for (int i=0; i < 5; i++) {
				System.out.println("Getting next Integer from queue: ");
				integerValue = genericQueueInteger.get();
				System.out.println(integerValue);
			}
			
		} catch (QueueEmptyException exception) {
			System.out.println(exception);
		}
		
		System.out.println();
		
		Double doubleStore[] = new Double[10];
		GenericQueue<Double> genericQueueDouble = new GenericQueue<Double>(doubleStore);
		
		Double doubleValue;
		
		System.out.println("Demonstrate a queue of Doubles.");
		try {
			for (int i=0; i < 5; i++) {
				System.out.println("Adding " + (double) i/2 + "to the genericQueueDouble.");
				genericQueueDouble.put((double) i/2);
			}
			
		} catch (QueueFullException exception) {
			System.out.println(exception);
		}
		
		System.out.println();
		
		try {
			for (int i=0; i < 5; i++) {
				System.out.println("Getting next Double from genericQueueDouble: ");
				doubleValue = genericQueueDouble.get();
				System.out.println(doubleValue);
			}
			
		} catch (QueueEmptyException exception) {
			System.out.println(exception);
		}

	}

}
