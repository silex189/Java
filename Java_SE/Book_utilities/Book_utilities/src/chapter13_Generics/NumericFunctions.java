package chapter13_Generics;

class NumericFunctions<T extends Number> {
	T numeric;
	
	public NumericFunctions(T numeric) {
		this.numeric = numeric;
	}
	
	double reciprocal() {
		return 1 / numeric.doubleValue();
	}
	
	double fraction() {
		return numeric.doubleValue() - numeric.intValue();
	}
	
	boolean absolutesEqual(NumericFunctions<?> numericFunctions) {
		if (Math.abs(numeric.doubleValue()) ==
				Math.abs(numericFunctions.numeric.doubleValue())) return true;
		return false;
	}
	
}
