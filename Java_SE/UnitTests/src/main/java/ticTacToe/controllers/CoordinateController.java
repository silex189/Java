package main.java.ticTacToe.controllers;

import main.java.ticTacToe.models.Coordinate;

public interface CoordinateController {
	
	Coordinate getOrigin();

	Coordinate getTarget();

	void accept(CoordinateControllerVisitor coordinateControllerVisitor);

}
