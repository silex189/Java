package samples;

import java.util.*;

public class Maps {
	
	public static void main(String args[]) {
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		Iterator iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			System.out.println("Key: " + key + " -> Value: " + hashMap.get(key));
		}
		
		iterator = linkedHashMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			System.out.println("Key: " + key + " -> Value: " + linkedHashMap.get(key));
		}
		
		iterator = treeMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			System.out.println("Key: " + key + " -> Value: " + treeMap.get(key));
		}
		
	}

}
