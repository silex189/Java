package characteristics.risk.innocuous.butterfingers.v3;

public class ClosedInterval extends blackBox.equivalenceClasses.closedInterval.ClosedInterval {

	public ClosedInterval(double min, double max) {
		super(min, max);
	}

	public double getMin() {
		return this.getMiddlePoint() - this.getLength()/2;
	}

	public double getMax() {
		return this.getMiddlePoint() + this.getLength()/2;
	}
}
