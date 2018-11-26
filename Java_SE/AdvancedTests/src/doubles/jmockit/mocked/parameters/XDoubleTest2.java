package doubles.jmockit.mocked.parameters;

import org.junit.Test;

import mockit.Mocked;

public class XDoubleTest2 {

	@Test
	public void testM(@Mocked Y y1, @Mocked Z z1)
	{
	   new X().m(y1,new Y(),z1,new Z());
	}
}
