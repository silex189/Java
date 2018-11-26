package doubles.jmockit.mocked.locals;

import org.junit.Test;

import mockit.Mocked;

public class XDoubleTest {

	@Mocked private Y y;
	
//	@Mocked private Z z;	
	
	@Test
	public void testM()
	{
	   new X().m();
	}
}
