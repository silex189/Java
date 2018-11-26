package main.java.ticTacToe.controllers.local;

import main.java.ticTacToe.controllers.OperationController;
import main.java.ticTacToe.controllers.OperationControllerVisitor;
import main.java.ticTacToe.controllers.local.LocalController;
import main.java.ticTacToe.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}

	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
