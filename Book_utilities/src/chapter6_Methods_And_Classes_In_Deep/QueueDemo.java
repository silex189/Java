package chapter6_Methods_And_Classes_In_Deep;

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
		
		//Queue queueTest = new Queue(10);
		/*queueTest.queue[9] = 99;
		queueTest.putloc = -100;*/
    

  }
}