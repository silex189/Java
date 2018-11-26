package test.java.ticTacToe.models;

import org.junit.Before;

public class InheritDecisionTreeBoardTest extends InheritBoardTest {

	@Before
	public void before() {
		OUTBoard = new DecisionTreeBoard();
	}

}
