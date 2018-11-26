package doubles.jmockit.mocked.mixed;

import org.junit.Test;

import mockit.Mocked;

public class XDoubleTest {

	@Mocked private Y y1;

	@Test
	public void testM(@Mocked Y y2)
	{
	   new X().m(y2);
	}
}
