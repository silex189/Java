package chapter06_Methods_And_Classes_In_Deep;

public class QueueConstructorDemo {
  public static void main(String[] args) {
  
  int i;
	  
  Queue queue1 = new Queue(10);
  for(i=0; i < 10; i++)
    queue1.put((char) ('A' + i));

  char name[] = {'T', 'o', 'm'};
  Queue queue2 = new Queue(name);

  Queue queue3 = new Queue(queue1);

  char ch;
  
  System.out.println("Contents of queue1: ");
  for(i=0; i < 10; i++) {
    ch = queue1.get();
    System.out.print(ch);
  }

  System.out.println("\n");
  
  System.out.println("Contents of queue2: ");
  for(i=0; i < 3; i++) {
    ch = queue2.get();
    System.out.print(ch);
  }

  System.out.println("\n");
  
  System.out.println("Contents of queue3: ");
  for(i=0; i < 10; i++) {
    ch = queue3.get();
    System.out.print(ch);
  }


  }
}