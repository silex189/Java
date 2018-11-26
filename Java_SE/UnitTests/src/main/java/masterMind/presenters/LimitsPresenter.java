package main.java.masterMind.presenters;

import main.java.masterMind.models.Limits;
import main.java.masterMind.utils.ClosedInterval;

public class LimitsPresenter {

	private int combinationLength;

	private int combinationColors;
	
	private Limits limits;

	public LimitsPresenter(Limits limits) {
		this.limits = limits;
	}

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
	
	public ClosedInterval getCombinationLengthClosedInterval() {
		return limits.getCombinationLengthClosedInterval();
	}
	
	public ClosedInterval getCombinationColorsClosedInterval() {
		return limits.getCombinationLengthClosedInterval();
	}

	public void apply() {
		limits.setCombinationLength(combinationLength);
		limits.setCombinationColors(combinationColors);
	}

}
