package chapter6;

public class Queue {

  private char queue[];
  private int putLocker, getLocker;

  Queue(int size) {
    queue = new char[size];
    putLocker = getLocker = 0;
  }

  Queue(Queue queue) {
    this.putLocker = queue.putLocker;
    this.getLocker = queue.getLocker;
    this.queue = new char[queue.length];

    for(int i=getLocker; i <= putLocker; i++)
      this.queue[i] = queue.queue[i];
  }

  Queue(char queue[]) {
    putLocker = 0;
    getLocker = 0;
    this.queue = new char[queue.length];

    for(int i = 0; i <= queue.length; i++)
      put(queue[i]);
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




