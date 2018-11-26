package main.java.ticTacToe.controllers;

import main.java.ticTacToe.models.Color;
import main.java.ticTacToe.models.Coordinate;

public interface PresenterController {
	
	Color getColor(Coordinate coordinate);

}
