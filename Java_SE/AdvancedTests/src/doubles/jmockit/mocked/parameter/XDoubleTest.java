package doubles.jmockit.mocked.parameter;

import org.junit.Test;

import mockit.Mocked;

public class XDoubleTest {

	@Test
	public void testM(@Mocked Y y)
	{
	   new X().m(y);
	}
}
