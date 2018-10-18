package chapter6;

class Queue {

  private char queue[];
  private int putLocker, getLocker;

  Queue(int size) {
    queue = new char[size];
    putLocker = getLocker = 0;
  }

  void put(char character) {
    if(putLocker == queue.length) {
      System.out.println(" - Queue is full");
      return;
    } else
      queue[putLocker] = (char) character;
      putLocker++;
      return;
  }

  char get() {
    if(getLocker == putLocker) {
			System.out.println("- Queue is empty");
      return (char) 0;
    } else {
      int tmpGetLocker;
      tmpGetLocker = getLocker;
      getLocker++;
      return queue[tmpGetLocker];
    }
  }

}



public class QueueDemo {

	public static void main(String[] args) {
    
    Queue bigQueue = new Queue(100);
		Queue smallQueue = new Queue(4);
		Queue emptyQueue = new Queue(3);
    int i;

    System.out.println("Using bigQueue to store the alphabet");
    for(i = 0; i < 26; i++)
      bigQueue.put( (char) ('A' + i));

    System.out.println("Contents of BigQueue: ");
    for(i = 0; i < 26; i++) 
      System.out.print(bigQueue.get() + " "); 
    
      System.out.println("\n");
      System.out.println("Using smallQueue to generate errors\n");
    

    for(i = 0; i < 5; i++) {
      System.out.print("Attempting to store " + (char) ('Z' - i));
      smallQueue.put( (char) ('Z' - i));
      System.out.println();
    }

    System.out.println();

    System.out.print("Contents of smallQueue: ");
    for(i = 0; i < 5; i++) {
      System.out.print(smallQueue.get() + " ");
		}
		
		
		System.out.println();

		System.out.print("Content of emptyQueue");
		System.out.print(emptyQueue.get());
		
		Queue queueTest = new Queue(10);
		/*queueTest.queue[9] = 99;
		queueTest.putloc = -100;*/
		

  }
}