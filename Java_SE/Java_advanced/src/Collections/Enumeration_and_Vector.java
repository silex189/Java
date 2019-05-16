package Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Enumeration_and_Vector {

	public static void main(String[] args) {


		Vector<Integer> vector = new Vector<Integer>(10);
		for (int i = 0; i < vector.capacity(); i++) {
			vector.addElement(i);
			System.out.println(vector);
		}
		
		Enumeration<Integer> enumeration =  vector.elements();
		
		System.out.print("Enumaration: ");
		while(enumeration.hasMoreElements()) {
			int i = (Integer) enumeration.nextElement();
			
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		Iterator<Integer> iterator = vector.iterator();

		System.out.print("Iterator:");
		while(iterator.hasNext()) {
			System.out.print(" " + iterator.next());
		}
	}

}
//for (Enumeration<E> e = v.elements(); e.hasMoreElements();)
//    System.out.println(e.nextElement());