package main.java.masterMind.models;

public class ProposalCombination extends Combination {

	private Result result;
	
	public ProposalCombination(Color[] colors, SecretCombination secretCombination) {
		super(colors);
		assert secretCombination != null;
		result = secretCombination.getResponse((Combination) this);
	}
	
	public Result getResult() {
		return result;
	}

	public boolean isGameOver() {
		return result.isGameOver(colors.size());
	}
}
