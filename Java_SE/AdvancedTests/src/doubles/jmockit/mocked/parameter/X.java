package doubles.jmockit.mocked.parameter;

public class X {

	public void m(Y y) {
		System.out.println("m de X");
		y.m();
	}

}
