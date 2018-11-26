package doubles.introduction.v2.order;

import org.junit.Test;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;

public class OrderDoubleMockTest {

	private String name;

	private int amount;

	@Mocked
	private Warehouse warehouseMock;

	@Mocked
	private MailService mailService;

	@Test
	public void testFillingRemovesInventoryIfInStock() {
		name = "Talisker";
		amount = 50;
		Order order = new Order(name, amount, mailService);
		new Expectations() {{
			warehouseMock.getInventory(name); result = amount;
		}};
		order.fill(warehouseMock);
		new Verifications() {{
			warehouseMock.getInventory(name); times=1;
			warehouseMock.remove(name, amount); times=1;
			mailService.send((Message) any); times=0;
		}};
	}

	@Test
	public void testFillingDoesNotRemoveIfNotEnoughInStock() {
		name = "Talisker";
		amount = 51;
		Order order = new Order(name, amount, mailService);
		new Expectations() {{
			warehouseMock.getInventory(anyString); result = amount-1;
		}};
		order.fill(warehouseMock);
		new Verifications() {{
			warehouseMock.getInventory(name);times=1;
			warehouseMock.remove(name, amount); times=0;
			mailService.send((Message) any);times=1;
		}};
	}
}
