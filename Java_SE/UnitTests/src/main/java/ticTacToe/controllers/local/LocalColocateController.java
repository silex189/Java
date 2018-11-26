package main.java.ticTacToe.controllers.local;

import main.java.ticTacToe.controllers.ColocateController;
import main.java.ticTacToe.controllers.CoordinateController;
import main.java.ticTacToe.controllers.Error;
import main.java.ticTacToe.models.Coordinate;
import main.java.ticTacToe.models.Game;

abstract class LocalColocateController extends LocalOperationController
		implements ColocateController {

	private LocalCoordinateController coordinateController;

	protected LocalColocateController(Game game,
			LocalCoordinateController coordinateController) {
		super(game);
		assert coordinateController != null;
		this.coordinateController = coordinateController;
	}

	public Error validateTarget(Coordinate target) {
		if (!this.empty(target)) {
			System.out.println("Error no libre");
			return Error.NOT_EMPTY;
		}
		return null;
	}

	public CoordinateController getCoordinateController() {
		return coordinateController;
	}

}
