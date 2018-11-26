package doubles.jmockit.mocked.field;

import org.junit.Test;

import mockit.Mocked;

public class XDoubleTest {

	@Mocked private Y y;

	@Test
	public void testM()
	{
	   new X().m();
	}
}
