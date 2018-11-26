package main.java.masterMind.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Combination {

	protected List<Color> colors;

	protected Combination() {
		this.colors = new ArrayList<Color>();
	}
	
	public Combination(Color[] colors) {
		this();
		assert colors != null;
		for (int i = 0; i < colors.length; i++) {
			assert colors[i] != null;
		}
		for (int i = 0; i < colors.length; i++) {
			this.colors.add(colors[i]);
		}
	}
	
	public Color[] getColors(){
		Color[] colors = new Color[this.colors.size()];
		return this.colors.toArray(colors);
	}

}
