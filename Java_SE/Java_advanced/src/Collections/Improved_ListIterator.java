package Collections;
import java.util.ArrayList;
import java.util.ListIterator;

public class Improved_ListIterator {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		
		for(int i = 0; i < 10; i++)
			arrayList.add(i);
				
		System.out.println(arrayList);
		
		ListIterator<Integer> listIterator = arrayList.listIterator();
		
		while (listIterator.hasNext()) {
			
			int i = listIterator.next();
			
			System.out.print(i + " ");
			
			if (i % 2 == 0) {
				i++;
				listIterator.set(i);
				listIterator.add(i);
			}
		}
		
		System.out.println();
		System.out.println(arrayList);

	}

}
