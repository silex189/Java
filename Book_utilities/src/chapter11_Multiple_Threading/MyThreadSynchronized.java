package chapter11_Multiple_Threading;

public class MyThreadSynchronized implements Runnable {
  Thread thread;
  static SumArray sumArray = new SumArray();
  int array[];
  int answer;

  MyThreadSynchronized(String name, int nums[]) {
    thread = new Thread(this, name);
    array = nums;
    thread.start();
  }

  public void run() {
    int sum;
    System.out.println(thread.getName() + " starting.");

    answer = sumArray.sumArray(array);
    System.out.println("Sum for " + thread.getName() + " is " + answer);

    System.out.println(thread.getName() + " terminating.");
  }

}
