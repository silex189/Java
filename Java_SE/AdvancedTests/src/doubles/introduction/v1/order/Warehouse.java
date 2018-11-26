package doubles.introduction.v1.order;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

	private Map<String, Integer> products;
	
	public Warehouse() {
		products = new HashMap<String, Integer>();
	}

	public void add(String name, int amount) {
		products.put(name, amount);		
	}
	
	public int getInventory(String name) {
		Integer inventory = products.get(name);
		return inventory.intValue();
	}

	public void remove(String name, int amount) {
		products.put(name, products.get(name)-amount);
	}
	
}
