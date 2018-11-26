package doubles.jmockit.expectationsAndVerifications;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;

public class XDoubleTest {

	@Mocked private Y y;

	@Test
	public void testM() {
		new Expectations() {{
			y.m(); result = 999;
			y.n(anyInt); result = 999;
			y.p(anyInt); returns(1,2,3); result = new Exception("del doble");
		}};
		new X().m();
		new Verifications() {{
			List<Y> ys = withCapture(new Y());
			System.out.println(ys.size());
			assertEquals(3, ys.size());
			
			y.n(anyInt); times=1;
			
			int x;
			y.n(x = withCapture());
			assertEquals(666, x);
			List<Integer> list = new ArrayList<Integer>();
			y.p(withCapture(list));times = 3;
			for (Integer value : list) {
				System.out.println("Se obtuvo: " + value);
			}
			
		}};
	}
}



