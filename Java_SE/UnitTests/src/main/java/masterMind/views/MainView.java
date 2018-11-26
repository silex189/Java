package main.java.masterMind.views;

import main.java.masterMind.presenters.LimitsPresenter;
import main.java.masterMind.presenters.GamePresenter;
import main.java.masterMind.utils.IO;
import main.java.masterMind.utils.LimitedIntDialog;

public class MainView {

	private LimitsPresenter limitsPresenter;

	private GamePresenter gamePresenter;

	public MainView(LimitsPresenter limitsPresenter, GamePresenter gamePresenter) {
		this.limitsPresenter = limitsPresenter;
		this.gamePresenter = gamePresenter;
		this.setLimits();
		this.playGame();
	}

	private void setLimits() {
		limitsPresenter.setCombinationLength(new LimitedIntDialog(
				"Longitud de las combinaciones", limitsPresenter
						.getCombinationLengthClosedInterval()).read());
		limitsPresenter.setCombinationColors(new LimitedIntDialog(
				"Colores de las combinaciones", limitsPresenter
						.getCombinationColorsClosedInterval()).read());
		limitsPresenter.apply();
	}

	private void playGame() {
		gamePresenter.reset();
		String[] secretColors;
		do {
			secretColors = gamePresenter.getSecretColors();
			this.println(secretColors);
			String[][] combinationColors = gamePresenter.getCombinationColors();
			int[][] results = gamePresenter.getResults();
			this.println(combinationColors, results);
			String[] proposalColors = this.readln(secretColors.length, gamePresenter.getColors());
			gamePresenter.setProposalColors(proposalColors);
		} while (!gamePresenter.isGameOver());
		this.println(secretColors);
		String[][] combinationColors = gamePresenter.getCombinationColors();
		int[][] results = gamePresenter.getResults();
		this.println(combinationColors, results);
		System.out.println("Conseguido en " + combinationColors.length + " intentos");
		
	}
	
	private void println(String[] colors) {
		this.print("Secreto", colors);
		System.out.println();
	}
	
	private void println(String[][] colors, int[][] results){
		for (int i = 0; i < colors.length; i++) {
			if (colors[i] != null) {
				this.println(colors[i], results[i]);
			}
		}
	}
	
	private void println(String[] colors, int[] results) {
		this.print("Combinación", colors);
		System.out.print(" | Bulls & Cows: ");
		for (int i = 0; i < results.length; i++) {
			System.out.print(results[i] + " ");
		}
		System.out.println();
	}

	private void print(String title, String[] colors) {
		System.out.print(title + ": ");
		for (int i = 0; i < colors.length; i++) {
			System.out.print(colors[i] + " ");
		}
	}

	private String[] readln(int combinationLength, String[] colors) {
		String[] result = new String[combinationLength];
		IO io = new IO();
		io.writeln("Propuesta: ");
		for (int i = 0; i < combinationLength; i++) {
			result[i] = this.readln(colors);
		}
		return result;
	}
	
	private String readln(String[] colors){
		for(int i=0; i<colors.length; i++){
			System.out.println((i+1)+" ." + colors[i]);
		}
		int option = new LimitedIntDialog("Opción", colors.length).read();
		return colors[option-1];
	}

}
