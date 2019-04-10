package chapter04_Classes_Objects_and_Methods;

class Power {

	double base;
	int exponent;
	double value;

	Power(double base, int exponent) {
		this.base = base;
		this.exponent = exponent;

		value = 1;
		if(exponent == 0) return;
		for( ; exponent > 0; exponent--)
			value = value * base;
	}

	double getValue() {
		return value;
	}
}

public class NumberPowerCalculatorMain {
	public static void main(String[] args) {
		
		Power power = new Power(4.0, 2);
		System.out.println(power.base + " raised to the " + power.exponent + " power is " + power.getValue());

		power = new Power(2.5, 1);
		System.out.println(power.base + " raised to the " + power.exponent + " power is " + power.getValue());
		
		power = new Power(5.7, 0);
		System.out.println(power.base + " raised to the " + power.exponent + " power is " + power.getValue());
		
	}
}
