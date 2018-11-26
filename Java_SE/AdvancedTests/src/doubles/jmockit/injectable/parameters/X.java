package doubles.jmockit.injectable.parameters;

public class X {

	public void m(Y y1, Y y2, Z z1, Z z2) {
		System.out.println("m de X");
		y1.m();
		y2.m();
		z1.m();
		z2.m();
	}

}
