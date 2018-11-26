package main.java.ticTacToe.controllers;

import main.java.ticTacToe.models.Coordinate;

public interface MoveController extends ColocateController {

	Error validateOrigin(Coordinate origin);

	void remove(Coordinate origin);

	Error validateTarget(Coordinate origin, Coordinate target);

}
