package doubles.jmockit.expectationsAndVerifications;

public class X {

	private Y y;
	
	public X() {
		y = new Y();
	}
	
	public void m() {
		System.out.println("m de X");
		System.out.println("Devuelto por y.m(): " + y.m());
		System.out.println("Devuelto por y.n(666): " + y.n(666));
		for (int i = 0; i < 3; i++) {
			System.out.println("Devuelto por y.p(666+i): " + y.p(666+i));
		}
		new Y();
		new Y();
	}

}
