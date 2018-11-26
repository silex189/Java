package main.java.masterMind.models;

public class Result {

	private int bulls;
	
	private int cows;

	public Result(int bulls, int cows) {
		this.bulls = bulls;
		this.cows = cows;
	}
	
	public int getBulls(){
		return bulls;
	}

	public int getCows(){
		return cows;
	}

	public boolean isGameOver(int combinationLength) {
		return bulls == combinationLength;
	}
	
}
