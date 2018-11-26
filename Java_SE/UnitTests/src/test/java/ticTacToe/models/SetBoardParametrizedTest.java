package test.java.ticTacToe.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SetBoardParametrizedTest {

	@Parameter(0) public Coordinate[] OUTCoordinates;

	@Parameter(1) public Coordinate existingCoordinate;
	@Parameter(2) public Coordinate notExistingCoordinate;
	@Parameter(3) public Color existingColor;
	@Parameter(4) public Color notExistingColor;
	@Parameter(5) public Color existingTicTacToe;
	@Parameter(6) public Color notExistingTicTacToe;
	
	@Parameter(7) public boolean expectedComplete;
	@Parameter(8) public boolean expectedExistTicTacToe;
	
	private SetBoard OUTSetBoard;
	private static final Color[] ALTERNATIVE_COLORS = new Color[] {
			Color.XS,
			Color.OS,
			Color.XS,
			Color.OS,
			Color.XS,
			Color.OS, };;

	@Parameters(name = "{index}")
	public static Collection<Object[]> data() {
		
		Coordinate[] OUTCoordinates;
				
		OUTCoordinates = new Coordinate[] {
				new Coordinate(0,0), 
				new Coordinate(0,1),
				new Coordinate(1,1),
				new Coordinate(1,2),
				new Coordinate(2,2)};
		
		Object[] array0 = new Object[] {OUTCoordinates, 
				new Coordinate(0,0), new Coordinate(0,2), Color.XS, Color.OS, Color.XS, Color.OS, 
				false, true};
		
		OUTCoordinates = new Coordinate[] {
				new Coordinate(0,0), 
				new Coordinate(0,1),
				new Coordinate(0,2),
				new Coordinate(1,0),
				new Coordinate(1,1),
				new Coordinate(1,2),};
		
		Object[] array1 = new Object[] {OUTCoordinates, 
				new Coordinate(1,0), new Coordinate(2,2), Color.OS, Color.OS, null, Color.XS, 
				true, false};
		
		return Arrays.asList(new Object[][] { array0, array1, });
	}
	
	@Before
	public void before(){
		OUTSetBoard = new SetBoard();
		for(int i=0; i<OUTCoordinates.length; i++){
			OUTSetBoard.put(OUTCoordinates[i], ALTERNATIVE_COLORS[i]);
		}
	}

	@Test
	public void testGetColor() {		
		assertEquals(existingColor, OUTSetBoard.getColor(existingCoordinate));
		assertEquals(Color.NONE, OUTSetBoard.getColor(notExistingCoordinate));
	}

	@Test
	public void testComplete() {
		assertEquals(expectedComplete, OUTSetBoard.complete());
	}

	@Test
	public void testExistTicTacToe() {
		if (existingTicTacToe != null){
			assertEquals(expectedExistTicTacToe, OUTSetBoard.existTicTacToe(existingTicTacToe));
		}
		assertFalse(OUTSetBoard.existTicTacToe(notExistingTicTacToe));
	}

	@Test
	public void testEmpty() {
		assertTrue(OUTSetBoard.empty(notExistingCoordinate));
		assertFalse(OUTSetBoard.empty(existingCoordinate));
	}

	@Test
	public void testFull() {
		assertTrue(OUTSetBoard.full(existingCoordinate, existingColor));
		assertFalse(OUTSetBoard.full(notExistingCoordinate, notExistingColor));
	}
	
	@Test
	public void testPut() {
		if (!OUTSetBoard.complete()){
			OUTSetBoard.put(notExistingCoordinate, notExistingColor);
			assertEquals(notExistingColor, OUTSetBoard.getColor(notExistingCoordinate));
		}
	}
	
	@Test
	public void testRemove() {
		OUTSetBoard.remove(existingCoordinate, existingColor);
		assertEquals(Color.NONE, OUTSetBoard.getColor(notExistingCoordinate));
	}

	@Test
	public void testClear() {
		OUTSetBoard.clear();
		for (int i = 0; i < Color.values().length - 1; i++) {
			for (int j = 0; j < Color.values().length - 1; j++) {
				assertEquals(Color.NONE,
						OUTSetBoard.getColor(new Coordinate(i, j)));
			}
		}
	}
}
