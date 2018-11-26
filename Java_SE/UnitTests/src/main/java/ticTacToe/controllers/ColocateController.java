package main.java.ticTacToe.controllers;

import main.java.ticTacToe.models.Color;
import main.java.ticTacToe.models.Coordinate;

public interface ColocateController extends OperationController,
		PresenterController {

	Color take();

	void put(Coordinate target);

	boolean existTicTacToe();

	CoordinateController getCoordinateController();
	
	Error validateTarget(Coordinate target);

	void accept(ColocateControllerVisitor colocateControllerVisitor);

}
