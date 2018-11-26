package blackBox.equivalenceClasses;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	blackBox.equivalenceClasses.abs.MathTest.class,
	blackBox.equivalenceClasses.round.MathTest.class,
	blackBox.equivalenceClasses.planets.PlanetTest.class,
	blackBox.equivalenceClasses.days.DayTest.class,
	blackBox.equivalenceClasses.sqrt.MathTest.class,
	blackBox.equivalenceClasses.factorial.CombinatoricsTest.class,
	blackBox.equivalenceClasses.change.TurnTest.class,
	blackBox.equivalenceClasses.closedInterval.ClosedIntervalTest.class,
	blackBox.equivalenceClasses.date.DateTest.class,
	blackBox.equivalenceClasses.ratings.AllTests.class,
})
public class AllTests {

}
