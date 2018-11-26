package doubles.jmockit.injectable.fields;

import org.junit.Test;

public class XTest {

	@Test
	public void testM()
	{
	   new X(new Y(), new Y(), new Z(), new Z()).m();
	}
}
