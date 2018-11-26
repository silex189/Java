package main.java.ticTacToe.views.console;

import main.java.ticTacToe.controllers.PresenterController;
import main.java.ticTacToe.models.Coordinate;
import main.java.ticTacToe.utils.IO;

class BoardView {

	private PresenterController controller;

	BoardView(PresenterController controller) {
		assert controller != null;
		this.controller = controller;
	}

	void write() {
		IO io = new IO();
		for (int i = 0; i < Coordinate.DIMENSION; i++) {
			for (int j = 0; j < Coordinate.DIMENSION; j++) {
				new ColorView(controller.getColor(new Coordinate(i, j)))
						.write(" ");
			}
			io.writeln();
		}
	}
}
