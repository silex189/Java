package test.java.ticTacToe.models;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	TurnTest.class,
	TurnCompactTest.class,
	TurnWithAttributeTest.class,
	TurnWithConstructorTest.class,
	TurnWithBeforeTest.class, 
	TurnSharedTest.class,
	CoordinateWithExceptionTest.class,
	SetBoardWithExceptionTest.class, 
	CoordinateWithExpectedTest.class, 
	SetBoardWithExpectedTest.class,
	 })
public class AllTests {

}
