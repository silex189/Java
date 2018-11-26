package doubles.introduction.v1.order;

public class Order {
	
	private String name;
	
	private int amount;
	
	private boolean isFilled;

	public Order(String name, int amount) {
		this.name = name;
		this.amount = amount;
		isFilled = false;
	}

	public void fill(Warehouse warehouse) {
		isFilled = warehouse.getInventory(name) >= amount;
		if (isFilled) {
			warehouse.remove(name, amount);
		}
	}

	public boolean isFilled() {
		return isFilled;
	}

}
