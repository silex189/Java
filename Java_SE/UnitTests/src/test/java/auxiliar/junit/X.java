package test.java.auxiliar.junit;

class X {
	private int x;
	
	X() {
		this(0);
	}
	
	X(int x){
		this.x = x;
	}
	
	int getX() {
		return x;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		X other = (X) obj;
//		if (x != other.x)
//			return false;
//		return true;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		return result;
	}
	
}

