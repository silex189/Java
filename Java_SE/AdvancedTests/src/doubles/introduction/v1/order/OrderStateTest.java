package doubles.introduction.v1.order;

import static org.junit.Assert.assertTrue;

import org.junit.Before;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderStateTest {
	
	private static String TALISKER = "Talisker";
	
	private static String HIGHLAND_PARK = "Highland Park";
	
	private Warehouse warehouse;

	@Before
	public void before() throws Exception {
		warehouse = new Warehouse();
		warehouse.add(TALISKER, 50);
		warehouse.add(HIGHLAND_PARK, 25);
	}

	@Test
	public void testOrderIsFilledIfEnoughInWarehouse() {
		Order order = new Order(TALISKER, 50);
		order.fill(warehouse);
		assertTrue(order.isFilled());
		assertEquals(0, warehouse.getInventory(TALISKER));
	}

	@Test
	public void testOrderDoesNotRemoveIfNotEnough() {
	    Order order = new Order(TALISKER, 51);
	    order.fill(warehouse);
	    assertFalse(order.isFilled());
	    assertEquals(50, warehouse.getInventory(TALISKER));
	}
	
}
