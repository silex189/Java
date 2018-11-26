package doubles.jmockit.mocked.mixed;

public class X {

	private Y y1;
	
	public X() {
		y1 = new Y();
	}
	
	public void m(Y y2) {
		System.out.println("m de X");
		y1.m();
		y2.m();
		new Y().m();
	}

}
