package doubles.jmockit.mocked.locals;

public class X {

	public void m() {
		System.out.println("m de X");
		new Y().m();
		new Y().m();
		new Z().m();
		new Z().m();
	}

}
