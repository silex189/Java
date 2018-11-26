package doubles.jmockit.mocked.field;

public class X {

	private Y y;
	
	public X() {
		y = new Y();
	}
	
	public void m() {
		System.out.println("m de X");
		y.m();
	}

}
