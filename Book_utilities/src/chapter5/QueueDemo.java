package chapter5;

class Queue {

  char Queue[];
  int putLocker, getLocker;

  Queue(int size) {
    Queue = new char[size];
    putLocker = getLocker = 0;
  }

  void put(char character) {
    if(putLocker == Queue.length) {
      System.out.println(" - Queue is full");
      return;
    } else
      Queue[putLocker] = (char) character;
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
      return Queue[tmpGetLocker];
    }
  }

}



public class QueueDemo {

	public static void main(String[] args) {
    
    Queue bigQueue = new Queue(100);
		Queue smalQueue = new Queue(4);
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
      smalQueue.put( (char) ('Z' - i));
      System.out.println();
    }

    System.out.println();

    System.out.print("Contents of smallQueue: ");
    for(i = 0; i < 5; i++) {
      System.out.print(smalQueue.get() + " ");
		}
		
		System.out.println("\nFilling empty Queue");
		for(i = 0; i < 3; i++)
			emptyQueue.put( (char) ('a' + i));
		
		System.out.println();

		System.out.println("Content of empty Queue until run out");
		for(i = 0; i < 4; i++) {
			System.out.print(emptyQueue.get() + " ");
		}

  }
}