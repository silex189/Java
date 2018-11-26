package main.java.ticTacToe.controllers.local;

import main.java.ticTacToe.controllers.CoordinateControllerVisitor;
import main.java.ticTacToe.controllers.UserCoordinateController;
import main.java.ticTacToe.models.Coordinate;
import main.java.ticTacToe.models.Game;

public class LocalUserCoordinateController extends LocalCoordinateController
	implements UserCoordinateController {

	protected LocalUserCoordinateController(Game game) {
		super(game);
	}

	@Override
	public Coordinate getOrigin() {
		return new Coordinate();
	}

	@Override
	public Coordinate getTarget() {
		return new Coordinate();
	}

	@Override
	public void accept(CoordinateControllerVisitor coordinateControllerVisitor) {
		coordinateControllerVisitor.visit(this);
	}
	
}
