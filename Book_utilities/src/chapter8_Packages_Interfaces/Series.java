
package chapter8_Packages_Interfaces;

public interface Series {
	int getNext();

	default int[] getNextArray(int number) {
		int[] values = new int[number];

		for (int i = 0; i < number; i++)
			values[i] = getNext();
		return values;
	}

	void reset();

	void setStart(int start);
}
