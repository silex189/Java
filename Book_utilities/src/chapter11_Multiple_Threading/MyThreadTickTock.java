package chapter11_Multiple_Threading;

public class MyThreadTickTock implements Runnable {
  Thread thread;
  TickTock tickTock;

  MyThreadTickTock(String name, TickTock tickTock) {
    thread = new Thread(this, name);
    this.tickTock = tickTock;
    thread.start();
  }

  public void run() {
    if(thread.getName().compareTo("Tick") == 0) {
      for (int i = 0; i < 5; i++) {
        tickTock.tick(true);
      }

      tickTock.tick(false);

    } else {
      for (int i=0; i < 5; i++) {
        tickTock.tock(true);
      }

      tickTock.tock(false);
    }
  }

}
