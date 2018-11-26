package main.java.ticTacToe.controllers;

import main.java.ticTacToe.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
