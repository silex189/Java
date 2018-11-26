package doubles.introduction.v2.order;

public class Order {
	
	private String name;
	
	private int amount;
	
	private boolean isFilled;
	
	private MailService mailService;

	public Order(String name, int amount, MailService mailService) {
		this.name = name;
		this.amount = amount;
		this.mailService = mailService;
	}
	
	public void fill(Warehouse warehouse) {
		isFilled = warehouse.getInventory(name) >= amount;
		if (isFilled) {
			warehouse.remove(name, amount);
		} else {
			mailService.send(new Message());
		}
	}

	public boolean isFilled() {
		return isFilled;
	}

}
