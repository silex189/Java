package chapter11_Multiple_Threading;

public class PriorizedThreads implements Runnable {
  int count;
  Thread thread;
  static boolean stop = false;
  static String currentName;

  PriorizedThreads(String name) {
    thread = new Thread(this, name);
    count = 0;
    this.currentName = name;
  }

  public void run() {
    System.out.println(thread.getName() + " starting.");
    do {
      count++;
      if(currentName.compareTo(thread.getName()) != 0) {
        currentName = thread.getName();
        System.out.println("In " + currentName);
      }
    } while(stop == false && count < 100000);

    stop = true;
    System.out.println("\n" + thread.getName() + " terminating.");
  }

}
