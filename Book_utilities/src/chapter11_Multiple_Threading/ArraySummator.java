package chapter11_Multiple_Threading;

public class ArraySummator {
  private int summation;

  synchronized int summatorMethod(int nums[]) {
    summation = 0;

    for(int i=0; i < nums.length; i++) {
      summation += nums[i];

      System.out.println("Running total for " + Thread.currentThread().getName() + " is " + summation);
      
      try {
        Thread.sleep(10);
      } catch (InterruptedException exception) {
        System.out.println("Thread interrupted.");
      }
    }
    return summation;
  }

}
