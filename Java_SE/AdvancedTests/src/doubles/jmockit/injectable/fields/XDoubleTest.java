package doubles.jmockit.injectable.fields;

import org.junit.Test;

import mockit.Injectable;

public class XDoubleTest {

	@Test
	public void testM(@Injectable Y y1, @Injectable Z z1)
	{
	   new X(y1, new Y(), z1, new Z()).m();
	}
}
