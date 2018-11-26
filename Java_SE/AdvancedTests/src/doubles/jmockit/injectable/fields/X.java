package doubles.jmockit.injectable.fields;

public class X {

	private Y y1;
	
	private Y y2;
	
	private Z z1;
	
	private Z z2;
	
	public X(Y y1,Y y2,Z z1,Z z2) {
		this.y1 = y1;
		this.y2 = y2;
		this.z1 = z1;
		this.z2 = z2;
	}
	
	public void m() {
		System.out.println("m de X " + this);
		y1.m();
		y2.m();
		z1.m();
		z2.m();
	}

}
