package doubles.jmockit.mocked.fields;

import org.junit.Test;

import mockit.Mocked;

public class XDoubleTest2 {

	@Mocked private Y y;
	
//	@Mocked	private Z z;
	
	@Test
	public void testM() {
		new X().m();
	}
}
