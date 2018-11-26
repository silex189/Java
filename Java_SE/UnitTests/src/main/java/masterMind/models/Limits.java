package main.java.masterMind.models;

import main.java.masterMind.utils.ClosedInterval;

public class Limits {

	public final ClosedInterval COMBINATION_LENGTH = 
			new ClosedInterval(2, 10);

	public final ClosedInterval COMBINATION_COLORS = 
			new ClosedInterval(2, Color.values().length);
	
	public ClosedInterval getCombinationColorsClosedInterval() {
		return COMBINATION_COLORS;
	}

	public ClosedInterval getCombinationLengthClosedInterval() {
		return COMBINATION_LENGTH;
	}
	
	private int combinationLength;

	private int combinationColors;
	
	public void setCombinationLength(int combinationLength) {
		this.combinationLength = combinationLength;
	}

	public void setCombinationColors(int colorsLength) {
		this.combinationColors = colorsLength;
	}
	
	public int getCombinationLength() {
		return combinationLength;
	}

	public int getCombinationColors() {
		return combinationColors;
	}

}
