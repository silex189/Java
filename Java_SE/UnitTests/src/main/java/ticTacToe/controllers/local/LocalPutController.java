package main.java.ticTacToe.controllers.local;

import main.java.ticTacToe.controllers.ColocateControllerVisitor;
import main.java.ticTacToe.controllers.Error;
import main.java.ticTacToe.controllers.OperationControllerVisitor;
import main.java.ticTacToe.controllers.PutController;
import main.java.ticTacToe.models.Coordinate;
import main.java.ticTacToe.models.Game;

public class LocalPutController extends LocalColocateController implements
		PutController {

	LocalPutController(Game game, LocalCoordinateController coordinateController) {
		super(game, coordinateController);
	}

	@Override
	public void put(Coordinate target) {
		assert this.validateTarget(target) == null;
		super.put(target);
	}

	public Error validateTarget(Coordinate target) {
		return super.validateTarget(target);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

	@Override
	public void accept(ColocateControllerVisitor colocateControllerVisitor) {
		colocateControllerVisitor.visit(this);
	}
}
