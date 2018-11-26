package main.java.ticTacToe.controllers.local;

import main.java.ticTacToe.controllers.OperationControllerVisitor;
import main.java.ticTacToe.controllers.StartController;
import main.java.ticTacToe.models.Game;
import main.java.ticTacToe.models.State;
import main.java.ticTacToe.utils.ClosedInterval;

public class LocalStartController extends LocalOperationController implements
		StartController {

	private LocalColocateControllerBuilder colocateControllerBuilder;

	LocalStartController(Game game,
			LocalColocateControllerBuilder colocateControllerBuilder) {
		super(game);
		assert colocateControllerBuilder != null;
		this.colocateControllerBuilder = colocateControllerBuilder;
	}

	public void start(int users) {
		assert new ClosedInterval(0, this.numPlayers()).includes(users);
		assert this.getState() == State.INITIAL;
		colocateControllerBuilder.build(users);
		this.setState(State.IN_GAME);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

}
