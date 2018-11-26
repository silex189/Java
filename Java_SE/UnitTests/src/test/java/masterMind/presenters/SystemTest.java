package test.java.masterMind.presenters;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import masterMind.models.Color;
import masterMind.models.Game;
import masterMind.models.Limits;
import masterMind.utils.ClosedInterval;

import org.junit.Before;
import org.junit.Test;

public class SystemTest {

	Limits limits;
	Game game;
	LimitsPresenter limitsPresenter;
	GamePresenter gamePresenter;

	@Before
	public void before() {
		limits = new Limits();
		game = new Game(limits);
		limitsPresenter = new LimitsPresenter(limits);
		gamePresenter = new GamePresenter(game);
	}

	@Test
	public void test1() {
		limitsPresenter.setCombinationLength(3);
		limitsPresenter.setCombinationColors(4);
		limitsPresenter.apply();
		gamePresenter.reset();
		String[] secretColors = gamePresenter.getSecretColors();
		gamePresenter.setProposalColors(secretColors);
		assertTrue(gamePresenter.isGameOver());
	}
	
	@Test
	public void test2() {
		limitsPresenter.setCombinationLength(4);
		limitsPresenter.setCombinationColors(8);
		limitsPresenter.apply();
		gamePresenter.reset();
		String[] secretColors = gamePresenter.getSecretColors();
		for(String color:secretColors){
			System.out.print(color + " ");
		}
		System.out.println();
		this.modify(secretColors, 1, 1);
		gamePresenter.setProposalColors(secretColors);
		assertFalse(gamePresenter.isGameOver());
	}

	@SuppressWarnings("incomplete-switch")
	private void modify(String[] secretColors, int bulls, int cows) {
		ClosedInterval limits = new ClosedInterval(0, secretColors.length);
		assert limits.includes(bulls);
		assert limits.includes(cows);
		assert limits.includes(bulls + cows);
		Change[] changes = this.setChanges(secretColors.length, bulls, cows);
		List<String> bullColors = new ArrayList<String>();
		List<String> cowColors = new ArrayList<String>();
		List<String> newColors = new ArrayList<String>();
		for (int i = 0; i < changes.length; i++) {
			switch (changes[i]) {
			case BULL:
				bullColors.add(secretColors[i]);
				break;
			case COW:
				cowColors.add(secretColors[i]);
				break;
			}
		}
		cowColors.add(cowColors.remove(0));
		Color[] allColors = Color.values();
		int newColor = 0;
		boolean repeated;
		do {
			repeated = false;
			for(int j=0; j<secretColors.length && !repeated; j++){
				if (allColors[newColor].equals(secretColors[j])){
					repeated = true;
				}
			}
			if (repeated){
				newColor++;
			}
		} while(repeated);
		for(int i=0; i<secretColors.length-bulls-cows; i++){
			newColors.add(allColors[newColor].name());
		}
		for(int i=0; i<changes.length; i++){
			switch (changes[i]) {
			case BULL:
				secretColors[i] = bullColors.remove(0);
				break;
			case COW:
				secretColors[i] = cowColors.remove(0);
				break;
			case NEW:
				secretColors[i] = newColors.remove(0);
				break;
			}
		}
		for(String color:secretColors){
			System.out.print(color + " ");
		}
		System.out.println();
	}

	private Change[] setChanges(int length, int bulls, int cows) {
		Change[] changes = new Change[length];
		for (int i = 0; i < changes.length; i++) {
			if (bulls > 0) {
				changes[i] = Change.BULL;
				bulls--;
			} else if (cows > 0) {
				changes[i] = Change.COW;
				cows--;
			} else {
				changes[i] = Change.NEW;
			}
		}
		List<Change> changeList = Arrays.asList(changes);
		Collections.shuffle(changeList);
		return (Change[]) changeList.toArray();
	}

}
