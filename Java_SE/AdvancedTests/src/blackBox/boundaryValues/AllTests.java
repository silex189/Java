package blackBox.boundaryValues;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	blackBox.boundaryValues.abs.MathTest.class,
	blackBox.boundaryValues.round.MathTest.class,
	blackBox.boundaryValues.planets.PlanetTest.class,
	blackBox.boundaryValues.days.DayTest.class,
	blackBox.boundaryValues.date.DateTest.class,
	blackBox.boundaryValues.factorial.CombinatoricsTest.class,
	blackBox.boundaryValues.sqrt.MathTest.class,
})
public class AllTests {

}
