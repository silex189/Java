package doubles.introduction.v2.order;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;

public class OrderDoubleStubTest {

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
			warehouseMock.getInventory(anyString);result = amount;
		}};
		order.fill(warehouseMock);
		order.fill(warehouseMock);
		new Verifications() {{
			mailService.send((Message) any);
		}};
		assertTrue(order.isFilled());
	}

	@Test
	public void testFillingDoesNotRemoveIfNotEnoughInStock() {
		name = "Talisker";
		amount = 51;
		Order order = new Order(name, amount, mailService);
		new Expectations() {{ 
			warehouseMock.getInventory(anyString);result = amount-1;
		}};
		order.fill(warehouseMock);
		new Verifications() {{
			List<Message> messageList = new ArrayList<Message>();
			mailService.send(withCapture(messageList));
			assertTrue(messageList.size() == 1);
		}};
		assertFalse(order.isFilled());
	}
}
