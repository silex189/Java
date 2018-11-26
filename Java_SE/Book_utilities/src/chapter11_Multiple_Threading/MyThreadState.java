package chapter11_Multiple_Threading;

public class MyThreadState implements Runnable {
  Thread thread;
  boolean suspended;
  boolean stopped;

  MyThreadState(String name) {
    thread = new Thread(this, name);
    suspended = false;
    stopped = false;
    thread.start();
  }

  public void run() {
    System.out.println(thread.getName() + " starting.");

    try {
      for (int i=1; i < 1000; i++) {
        System.out.print(i + " ");
        if ((i%10) == 0) {
          System.out.println();
          Thread.sleep(250);
        }

        synchronized(this) {
          while (suspended) {
            wait();
          }

          if (stopped) break;
        }

      }

    } catch (InterruptedException exception) {
      System.out.println(thread.getName() + " interrupted.");
    }

    System.out.println(thread.getName() + " exiting.");
  }

  synchronized void myStop() {
    stopped = true;
    suspended = false;
    notify();
  }

  synchronized void mySuspend() {
    suspended = true;
  }

  synchronized void myResume() {
    suspended = false;
    notify();
  }

}
