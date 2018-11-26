package test.java.masterMind.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProposalCombinationTest {

	@Test
	public void testProposalCombination() {
		Limits limits = new Limits();
		limits.setCombinationLength(4);
		limits.setCombinationColors(6);
		SecretCombination secretCombination = new SecretCombination(limits);
		ProposalCombination proposalCombination = new ProposalCombination(secretCombination.getColors(), secretCombination);
		Color[] secretColors = secretCombination.getColors();
		Color[] proposalColors = proposalCombination.getColors();
		for (int i = 0; i < proposalColors.length; i++) {
			assertEquals(secretColors[i], proposalColors[i]);
		}
	}
	
	@Test
	public void testGetResult() {
		Limits limits = new Limits();
		limits.setCombinationLength(4);
		limits.setCombinationColors(6);
		SecretCombination secretCombination = new SecretCombination(limits);
		ProposalCombination proposalCombination = new ProposalCombination(secretCombination.getColors(), secretCombination);
		assertEquals(4, proposalCombination.getResult().getBulls());
		assertEquals(0, proposalCombination.getResult().getCows());
	}

	@Test
	public void testIsGameOver() {
		Limits limits = new Limits();
		limits.setCombinationLength(4);
		limits.setCombinationColors(6);
		SecretCombination secretCombination = new SecretCombination(limits);
		ProposalCombination proposalCombination = new ProposalCombination(secretCombination.getColors(), secretCombination);
		assertTrue(proposalCombination.isGameOver());
		limits = new Limits();
		limits.setCombinationLength(4);
		limits.setCombinationColors(6);
		secretCombination = new SecretCombination(limits);
		proposalCombination = new ProposalCombination(secretCombination.getColors(), secretCombination);
		assertTrue(proposalCombination.isGameOver());
	}

	

}
