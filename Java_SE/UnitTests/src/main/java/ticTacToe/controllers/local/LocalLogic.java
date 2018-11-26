package main.java.ticTacToe.controllers.local;

import main.java.ticTacToe.Logic;
import main.java.ticTacToe.models.Game;

public class LocalLogic implements Logic {

	private Game game;

	private LocalColocateControllerBuilder colocateControllerBuilder;
	
	private LocalStartController startController;

	private LocalContinueController continueController;

	public LocalLogic() {
		game = new Game();
		colocateControllerBuilder = new LocalColocateControllerBuilder(game);
		startController = new LocalStartController(game, colocateControllerBuilder);
		continueController = new LocalContinueController(game);
	}

	public LocalOperationController getOperationController() {
		switch (game.getState()){
		case INITIAL:
			return startController;
		case IN_GAME:
			return colocateControllerBuilder.getColocateController();
		case FINAL:
			return continueController;
		case EXIT:
		default:
			return null;
		}
	}
}
