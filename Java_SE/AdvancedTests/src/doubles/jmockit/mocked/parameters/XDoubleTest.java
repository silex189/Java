package doubles.jmockit.mocked.parameters;

import org.junit.Test;

import mockit.Mocked;

public class XDoubleTest {

	@Test
	public void testM(@Mocked Y y1, @Mocked Y y2, @Mocked Z z1, @Mocked Z z2)
	{
	   new X().m(y1,y2,z1,z2);
	}
}
