package main.java.ticTacToe.views.console;

import main.java.ticTacToe.controllers.StartController;
import main.java.ticTacToe.utils.LimitedIntDialog;

class StartView {

	void interact(StartController startController){
		int users = new LimitedIntDialog("Cuántos usuarios?", 0, 2).read();
		startController.start(users);
		new BoardView(startController).write();
	}
}
