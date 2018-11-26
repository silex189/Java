package main.java.ticTacToe.utils;

public class ClosedInterval {

	private int min;

	private int max;

	public ClosedInterval(int min, int max) {
		assert min <= max;
		this.min = min;
		this.max = max;
	}

	public int length() {
		return max - min;
	}

	public void shift(int value) {
		min += value;
		max += value;
	}

	public boolean includes(int value) {
		return min <= value && value <= max;
	}

	public boolean includes(ClosedInterval closedInterval) {
		assert closedInterval != null;
		return this.includes(closedInterval.min)
				&& this.includes(closedInterval.max);
	}

	public boolean intersected(ClosedInterval closedInterval) {
		assert closedInterval != null;
		return this.includes(closedInterval.min)
				|| this.includes(closedInterval.max)
				|| closedInterval.includes(this);
	}

	public ClosedInterval intersection(ClosedInterval closedInterval) {
		assert closedInterval != null;
		assert this.intersected(closedInterval);
		return new ClosedInterval(
				Math.max(min, closedInterval.min), 
				Math.min(max, closedInterval.max));
	}
	
	public ClosedInterval union(ClosedInterval closedInterval) {
		assert closedInterval != null;
		assert this.intersected(closedInterval);
		return new ClosedInterval(
				Math.min(min, closedInterval.min), 
				Math.max(max, closedInterval.max));
	}

	int getMin() {
		return min;
	}

	int getMax() {
		return max;
	}

	@Override
	public String toString() {
		return "[" + min + ", " + max + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + max;
		result = prime * result + min;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClosedInterval other = (ClosedInterval) obj;
		if (max != other.max)
			return false;
		if (min != other.min)
			return false;
		return true;
	}	

}
