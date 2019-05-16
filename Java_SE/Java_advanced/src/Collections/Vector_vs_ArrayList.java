package Collections;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Vector_vs_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Practice.GeeksforGeeks.org"); 
		arrayList.add("quiz.GeeksforGeeks.org"); 
		arrayList.add("code.GeeksforGeeks.org"); 
		arrayList.add("contribute.GeeksforGeeks.org"); 
		
		System.out.println("ArrayList elements are: ");
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext())
				System.out.println(iterator.next());
		
		Vector<String> vector = new Vector<>();
		vector.addElement("Practice");
		vector.addElement("quiz"); 
		vector.addElement("code"); 

        System.out.println("Vector capacity is " + vector.capacity());
        
        System.out.println("\nVector elements are: ");
        Enumeration enumeration = vector.elements();
        while(enumeration.hasMoreElements())
        	System.out.println(enumeration.nextElement());

	}
}
