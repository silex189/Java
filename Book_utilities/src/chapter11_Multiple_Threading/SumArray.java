package chapter11_Multiple_Threading;

public class SumArray {
  private int sum;

  synchronized int sumArray(int nums[]) {
    sum = 0;

    for(int i=0; i < nums.length; i++) {
      sum += nums[i];

      System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
      
      try {
        Thread.sleep(10);
      } catch (InterruptedException exception) {
        System.out.println("Thread interrupted.");
      }
    }
    return sum;
  }

}
