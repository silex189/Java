package main.java.ticTacToe.controllers.local;

import main.java.ticTacToe.controllers.ContinueController;
import main.java.ticTacToe.controllers.OperationControllerVisitor;
import main.java.ticTacToe.models.Game;
import main.java.ticTacToe.models.State;

public class LocalContinueController extends LocalOperationController implements
		ContinueController {

	LocalContinueController(Game game) {
		super(game);
	}

	public void resume(boolean another) {
		assert this.getState() == State.FINAL;
		if (another) {
			this.clear();
			this.setState(State.INITIAL);
		} else {
			this.setState(State.EXIT);
		}
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

}