package doubles.jmockit.mocked.fields;

public class X {

	private Y y1;
	
	private Y y2;
	
	private Z z1;
	
	private Z z2;
	
	public X() {
		y1 = new Y();
		y2 = new Y();
		z1 = new Z();
		z2 = new Z();
	}
	
	public void m() {
		System.out.println("m de X " + this);
		y1.m();
		y2.m();
		z1.m();
		z2.m();
	}

}
