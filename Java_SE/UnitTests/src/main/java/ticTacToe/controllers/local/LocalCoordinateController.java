package main.java.ticTacToe.controllers.local;

import main.java.ticTacToe.controllers.CoordinateController;
import main.java.ticTacToe.models.Coordinate;
import main.java.ticTacToe.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
