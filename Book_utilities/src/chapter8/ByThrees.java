package chapter8;

public class ByThrees implements Series {
	int start;
	int value;

	ByThrees() {
		start = value = 0;
	}

	@Override
	public int getNext() {
		value += 3;
		return value;
	}

	@Override
	public void reset() {
		value = start;

	}

	@Override
	public void setStart(int start) {
		this.start = start;
		value = start;
	}
}
