package test.java.ticTacToe.models;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class EfficiencySetBoardTest {

	@Parameter(0) public Board OUTBoard;
	
	@Parameter(1) public Color color;
	
	@Parameter(2) public boolean expectedExistTicTacToe;
	
	private static long startTime;
	
	private static long finishTime;
	
	private static long sum = 0;
	
	private static long items = 0;
	
	private static long max = Long.MIN_VALUE;
	
	private static long min = Long.MAX_VALUE;
	
	@Parameters
	public static Collection<Object[]> data() {
		Board board = new SetBoard();
		board.put(new Coordinate(0, 0), Color.OS);
		board.put(new Coordinate(0, 1), Color.XS);
		board.put(new Coordinate(0, 2), Color.OS);
		board.put(new Coordinate(1, 0), Color.XS);
		board.put(new Coordinate(1, 1), Color.OS);
		board.put(new Coordinate(1, 2), Color.XS);
		return Arrays
				.asList(new Object[][] {
						{board, Color.OS, false},
						{board, Color.XS, false}, });
				
	}
	
	@Before
	public void before() {
		startTime = System.currentTimeMillis();
	}

	@Test(timeout = 5)
	public void testExistTicTacToe() {
		for(int i=0; i<1000; i++){
			assertEquals(expectedExistTicTacToe, OUTBoard.existTicTacToe(color));
		}
	}
	
	@After
	public void after() {
		finishTime = System.currentTimeMillis();
		long time = finishTime - startTime;
		items++;
		sum += time;
		if (time>max){
			max = time;
		}
		if (time<min){
			min = time;
		}
	}
	
	@AfterClass 
	public static void afterClass() {
		System.out.println("Máximo: " + max);
		System.out.println("Media: " + (sum/items));
		System.out.println("Mínimo: " + min);
	}
}
