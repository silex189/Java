package main.java.masterMind.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecretCombination extends Combination {

	public SecretCombination(Limits limits) {
		super();
		List<Color> allPermisiveColors = new ArrayList<Color>();
		for (int i = 0; i < limits.getCombinationColors(); i++) {
			allPermisiveColors.add(Color.values()[i]);
		}
		Collections.shuffle(allPermisiveColors);
		for (int i = 0; i < limits.getCombinationLength(); i++) {
			this.colors.add(allPermisiveColors.remove(0));
		}
	}

	public Result getResponse(Combination combination) {
		List<Color> secretCombinationColors = new ArrayList<Color>(this.colors);
		List<Color> combinationColors = new ArrayList<Color>(combination.colors);
		int bulls = 0;
		for(int i=0; i<secretCombinationColors.size(); ){
			if (secretCombinationColors.get(i) == combinationColors.get(i)){
				secretCombinationColors.remove(i);
				combinationColors.remove(i);
				bulls++;
			} else {
				i++;
			}
		}
		int cows = 0;
		for(int i=0; i<secretCombinationColors.size(); i++){
			if (secretCombinationColors.contains(combinationColors.get(i))){
				secretCombinationColors.remove(combinationColors.get(i));
				combinationColors.remove(i);
			}
		}
		return new Result(bulls, cows);
	}

}
