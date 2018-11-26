package main.java.ticTacToe.controllers;

import main.java.ticTacToe.models.Coordinate;

public interface PutController extends ColocateController {

	Error validateTarget(Coordinate target);

}
