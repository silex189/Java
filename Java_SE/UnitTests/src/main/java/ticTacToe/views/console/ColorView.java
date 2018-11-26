package main.java.ticTacToe.views.console;

import main.java.ticTacToe.models.Color;
import main.java.ticTacToe.utils.IO;

class ColorView {

	private static final char[] COLORS = { 'x', 'o', '_' };

	private Color color;

	private IO io;

	ColorView(Color color) {
		this.color = color;
		io = new IO();
	}

	void write(String title) {
		io.write(title + this.toChar());
	}
	
	void writeln(String title) {
		this.write(title);
		io.writeln();
	}

	void writeWinner() {
		io.writeln("Victoria!!!! " + this.toChar() + "! " + this.toChar()
				+ "! " + this.toChar() + "! Victoria!!!!");
	}

	private char toChar() {
		return COLORS[color.ordinal()];
	}
}
