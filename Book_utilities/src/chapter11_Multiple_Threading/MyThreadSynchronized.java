package chapter11_Multiple_Threading;

public class MyThreadSynchronized implements Runnable {
  Thread thread;
  static ArraySummator arraySummator = new ArraySummator();
  int array[];
  int answer;

  MyThreadSynchronized(String name, int array[]) {
    thread = new Thread(this, name);
    this.array = array;
    thread.start();
  }

  public void run() {
    System.out.println(thread.getName() + " starting.");

    answer = arraySummator.summatorMethod(array);
    System.out.println("Sum for " + thread.getName() + " is " + answer);

    System.out.println(thread.getName() + " terminating.");
  }

}
