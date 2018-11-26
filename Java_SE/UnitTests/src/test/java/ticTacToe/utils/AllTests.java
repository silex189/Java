package test.java.ticTacToe.utils;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	CoordinateTest.class,
	ClosedIntervalTest.class, 
	ClosedIntervalTest.class,
	ClosedIntervalReusabilityTest.class,
	CoordinateWithoutParametrizedTest.class,
	ClosedIntervalWithoutParametrizedTest.class, 
	CoordinateParametrizedTest.class,
	CoordinateParametrizedTest.class })
public class AllTests {

}