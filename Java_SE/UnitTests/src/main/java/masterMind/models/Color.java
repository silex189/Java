package main.java.masterMind.models;

public enum Color {
	RED,
	BLUE,
	GREEN,
	PURPLE,
	BROWN,
	YELLOW,
	PINK,
	WHITE,
	GREY,
	BLACK;
	
	public static Color getColor(String string){
		Color[] colors = Color.values();
		for (int i = 0; i < colors.length; i++) {
			if (colors[i].name().equals(string)){
				return colors[i];
			}
		}
		return null;
	}
	
	public static Color[] getFirstColors(int amount) {
		Color[] colors = new Color[amount];
		for (int i = 0; i < colors.length; i++) {
			colors[i] = Color.values()[i];
		}
		return colors;
	}

}
