package test.java.auxiliar.withoutJUnit;

import main.java.ticTacToe.utils.Coordinate;

public class CoordenateTest {

	public void testInRow() throws Exception {
		Coordinate coordinateLeft = new Coordinate(1, 1);
		Coordinate coordinateRight = new Coordinate(2, 3);
		boolean resultInRow = coordinateLeft.inRow(coordinateRight);
		boolean expectedInRow = false;
		if (expectedInRow != resultInRow) {
			throw new Exception("Con " + coordinateLeft + " y " + coordinateRight
					+ " esperaba " + expectedInRow + " pero fue " + resultInRow);
		}
		coordinateLeft = new Coordinate(45, 17);
		coordinateRight = new Coordinate(45, -9);
		resultInRow = coordinateLeft.inRow(coordinateRight);
		expectedInRow = true;
		if (expectedInRow != resultInRow) {
			throw new Exception("Con " + coordinateLeft + " y " + coordinateRight
					+ " esperaba " + expectedInRow + " pero fue " + resultInRow);
		}
	}

	public void testInColumn() throws Exception {
		Coordinate coordinateLeft = new Coordinate(1, 1);
		Coordinate coordinateRight = new Coordinate(2, 1);
		boolean resultInColumn = coordinateLeft.inColumn(coordinateRight);
		boolean expectedInColumn = true;
		if (expectedInColumn != resultInColumn) {
			throw new Exception("Con " + coordinateLeft + " y " + coordinateRight
					+ " esperaba " + expectedInColumn + " pero fue " + resultInColumn);
		}
	}

	public void testInMainDiagonal() throws Exception {
		Coordinate coordinate = new Coordinate(1, 1);
		boolean resultInMainDiagonal = coordinate.inMainDiagonal();
		boolean expectedInMainDiagonal = true;
		if (expectedInMainDiagonal != resultInMainDiagonal) {
			throw new Exception("Con " + coordinate + " esperaba " + expectedInMainDiagonal 
					+ " pero fue " + resultInMainDiagonal);
		}
	}

	public static void main(String[] args) {
		CoordenateTest coordenateTest = new CoordenateTest();
		try {
			coordenateTest.testInRow();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			coordenateTest.testInColumn();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			coordenateTest.testInMainDiagonal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
