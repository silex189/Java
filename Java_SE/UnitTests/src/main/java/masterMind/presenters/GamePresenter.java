package main.java.masterMind.presenters;

import main.java.masterMind.models.Color;
import main.java.masterMind.models.Game;
import main.java.masterMind.models.Result;

public class GamePresenter {

	private Game game;

	public GamePresenter(Game game) {
		this.game = game;
	}

	public void reset() {
		game.reset();
	}

	public String[] getColors() {
		Color[] colors = game.getColors();
		String[] result = new String[colors.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = colors[i].name(); 
		}
		return result;
	}

	public String[] getSecretColors() {
		Color[] colors = game.getSecretCombinationColors();
		String[] result = new String[colors.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = colors[i].name();
		}
		return result;
	}

	public String[][] getCombinationColors() {
		Color[][] colors = game.getProposalCombinationColors();
		String[][] result = new String[colors.length][];
		for (int i = 0; i < result.length; i++) {
			result[i] = new String[colors[i].length];
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = colors[i][j].name();
			}
		}
		return result;
	}

	public int[][] getResults() {
		Result[] results = game.getResults();
		int[][] result = new int[results.length][2];
		for (int i = 0; i < results.length; i++) {
			result[i][0] = results[i].getBulls();
			result[i][1] = results[i].getCows();
		}
		return result;
	}

	public void setProposalColors(String[] proposalColors) {
		Color[] colors = new Color[proposalColors.length];
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.getColor(proposalColors[i]);
		}
		game.setProposalCombination(colors);
	}

	public boolean isGameOver() {
		return game.isGameOver();
	}

}
