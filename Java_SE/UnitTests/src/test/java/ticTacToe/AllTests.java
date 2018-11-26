package test.java.ticTacToe;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	ticTacToe.utils.AllTests.class,
	ticTacToe.models.AllTests.class })
public class AllTests {

}
