package Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Universal_Iterator {
	public static void main(String[] args) {
		
		Collection<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++)
			arrayList.add(i);
		
		System.out.println(arrayList);
		
		Iterator<Integer> iterator = arrayList.iterator();
		
		while(iterator.hasNext()) {
			int i = (int) iterator.next();
			
			System.out.print(i + " ");
			
			if (i % 2 != 0)
				iterator.remove();
		}
		
		System.out.println();
		System.out.print(arrayList);
		
	}
}
