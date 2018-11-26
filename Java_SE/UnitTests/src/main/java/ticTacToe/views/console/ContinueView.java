package main.java.ticTacToe.views.console;

import main.java.ticTacToe.controllers.ContinueController;
import main.java.ticTacToe.utils.YesNoDialog;

class ContinueView {

	void interact(ContinueController continueController){
		continueController.resume(new YesNoDialog("Desea continuar")
		.read());
	}
}
