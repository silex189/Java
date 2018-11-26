package chapter06_Methods_And_Classes_In_Deep;

public class Queue {

  private char arrayQueue[];
  private int putLocker, getLocker;

  Queue(int size) {
    arrayQueue = new char[size];
    putLocker = getLocker = 0;
  }

  Queue(Queue queue) {
    this.putLocker = queue.putLocker;
    this.getLocker = queue.getLocker;
    this.arrayQueue = new char[queue.arrayQueue.length];

    for(int i=0; i < queue.arrayQueue.length; i++)
      this.arrayQueue[i] = queue.arrayQueue[i];
  }

  Queue(char queue[]) {
    putLocker = 0;
    getLocker = 0;
    arrayQueue = new char[queue.length];

    for(int i = 0; i < arrayQueue.length; i++)
      put(queue[i]);
  }

  void put(char character) {
    if(putLocker == arrayQueue.length) {
      System.out.println(" - Queue is full");
      return;
    } else
      arrayQueue[putLocker] = (char) character;
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
      return arrayQueue[tmpGetLocker];
    }
  }

}




