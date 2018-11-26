package doubles.introduction.v1.order;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import mockit.Expectations;
import mockit.Mocked;

public class OrderInteractionTest {

	private String name;
	
	private int amount;
	
	@Mocked
	private Warehouse warehouseMock;
	
	@Test
	public void testFillingRemovesInventoryIfInStock() {
		name = "Talisker";
		amount = 50;
		Order order = new Order(name, amount);
		new Expectations() {{
			warehouseMock.getInventory(name); result=amount;
		}};
		order.fill(warehouseMock);
		assertTrue(order.isFilled());
	}

	@Test
	public void testFillingDoesNotRemoveIfNotEnoughInStock() {
		name = "Talisker";
		amount = 51;
		Order order = new Order(name, amount);     
	    new Expectations() {{ 
			warehouseMock.getInventory(name); result=amount-1;
		}};
	    order.fill(warehouseMock);
	    assertFalse(order.isFilled());
	  }
}
