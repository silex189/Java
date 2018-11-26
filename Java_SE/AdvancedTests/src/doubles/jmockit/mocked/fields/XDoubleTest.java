package doubles.jmockit.mocked.fields;

import org.junit.Test;

import mockit.Mocked;

public class XDoubleTest {

	@Mocked private Y y1;
	
	@Mocked private Y y2;
	
	@Mocked	private Z z1;
	
	@Mocked	private Z z2;

	@Test
	public void testM() {
		new X().m();
	}
}
