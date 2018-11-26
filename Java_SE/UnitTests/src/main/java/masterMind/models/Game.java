package main.java.masterMind.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private Limits limits;
	
	private boolean isReset;
	
	private SecretCombination secretCombination;

	private List<ProposalCombination> proposalCombinations;

	public Game(Limits limits){
		assert limits != null;
		this.limits = limits;
		isReset = false;
	}
	
	public void reset() {
		secretCombination = new SecretCombination(limits);
		proposalCombinations = new ArrayList<ProposalCombination>();
		isReset = true;
	}
	
	public Color[] getColors() {
		return Color.getFirstColors(limits.getCombinationColors());
	}

	public Color[] getSecretCombinationColors() {
		assert isReset;
		return secretCombination.getColors();
	}

	public Color[][] getProposalCombinationColors() {
		assert isReset;
		Color[][] colors = new Color[proposalCombinations.size()][];
		for (int i = 0; i < colors.length; i++) {
			colors[i] = proposalCombinations.get(i).getColors();
		}
		return colors;
	}
	
	public void setProposalCombination(Color[] colors) {
		assert isReset;
		proposalCombinations.add(new ProposalCombination(colors, secretCombination));	
	}
	
	public Result[] getResults() {
		assert isReset;
		Result[] result = new Result[proposalCombinations.size()];
		for (int i = 0; i < proposalCombinations.size(); i++) {
			result[i] = proposalCombinations.get(i).getResult();
		}
		return result;
	}

	public boolean isGameOver() {
		assert isReset;
		return proposalCombinations.get(proposalCombinations.size()-1).isGameOver();
	}

}
