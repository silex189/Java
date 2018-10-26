package chapter8_Packages_Interfaces;

class ByTwos implements Series {
  int start;
  int value;
  int previous;

  ByTwos() {
    start = 0;
    value = 0;
    previous = -2;
  }

  @Override
  public int getNext() {
    previous = value;
    value += 2;
    return value;
  }

	@Override
	public void reset() {
    value = start;
    previous = value;
	}

	@Override
	public void setStart(int start) {
    this.start = start;
    value = start;
    previous = start - 2;
  }
  
  int getPrevious() { return previous; }
}
