package chapter6;

class CallByReference {
	private int i, j;

	CallByReference(int i, int j) {
		this.i = i;
		this.j = j;
	}

	void change(CallByReference callByReference) {
		callByReference.i = callByReference.i + callByReference.j;
		callByReference.j = -callByReference.j;
	}
	
	public int geti() {
		return i;
	}
	
	public int getj() {
		return j;
	}
}

public class ArgumentCalledByReference {

	public static void main(String[] args) {
		CallByReference callByReference = new CallByReference(15, 20);

		System.out.println("callByReference.i and callByReference.j before call: "
											+ callByReference.geti() + " " + callByReference.getj());
		callByReference.change(callByReference);
		System.out.println("callByReference.i and callByReference.j after call: "
											+ callByReference.geti() + " " + callByReference.getj());
	}

}
