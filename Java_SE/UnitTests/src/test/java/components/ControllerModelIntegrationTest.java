package test.java.components;

import static org.junit.Assert.*;

import org.junit.Test;

import ticTacToe.Logic;
import ticTacToe.controllers.PutController;
import ticTacToe.controllers.StartController;
import ticTacToe.controllers.local.LocalLogic;
import ticTacToe.models.Color;
import ticTacToe.models.Coordinate;

public class ControllerModelIntegrationTest {

	@Test
	public void testTicTacToeWithFiveCoordinateAndInDiagonalTicTacToe() {
		Logic logic = new LocalLogic();
		StartController startController = (StartController )logic.getOperationController();
		startController.start(2);
		PutController colocateController;
		colocateController = (PutController)logic.getOperationController();
		colocateController.put(new Coordinate(0, 0));
		colocateController = (PutController)logic.getOperationController();
		colocateController.put(new Coordinate(0, 1));
		colocateController = (PutController)logic.getOperationController();
		colocateController.put(new Coordinate(1, 1));
		colocateController = (PutController)logic.getOperationController();
		colocateController.put(new Coordinate(1, 2));
		colocateController = (PutController)logic.getOperationController();
		colocateController.put(new Coordinate(2, 2));
		assertEquals(Color.XS, colocateController.getColor(new Coordinate(0, 0)));
		assertEquals(Color.OS, colocateController.getColor(new Coordinate(0, 1)));
		assertEquals(Color.NONE, colocateController.getColor(new Coordinate(0, 2)));
		assertEquals(Color.NONE, colocateController.getColor(new Coordinate(1, 0)));
		assertEquals(Color.XS, colocateController.getColor(new Coordinate(1, 1)));
		assertEquals(Color.OS, colocateController.getColor(new Coordinate(1, 2)));
		assertEquals(Color.NONE, colocateController.getColor(new Coordinate(2, 0)));
		assertEquals(Color.NONE, colocateController.getColor(new Coordinate(2, 1)));
		assertEquals(Color.XS, colocateController.getColor(new Coordinate(2, 2)));
		assertTrue(colocateController.existTicTacToe());
	}

}
