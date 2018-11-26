package main.java.ticTacToe.views.console;

import main.java.ticTacToe.controllers.CoordinateController;
import main.java.ticTacToe.controllers.RandomCoordinateController;
import main.java.ticTacToe.controllers.UserCoordinateController;
import main.java.ticTacToe.models.Coordinate;

class MoveOriginCoordinateView extends ColocateCoordinateView {

	private Coordinate origin;
	
	MoveOriginCoordinateView(CoordinateController coordinateController) {
		super(coordinateController);
	}
	
	Coordinate getCoordinate() {
		origin = this.getCoordinateController().getOrigin();
		this.getCoordinateController().accept(this);
		return origin;
	}

	@Override
	public void visit(UserCoordinateController userCoordinateController) {
		new CoordinateView("De", origin).read();
	}

	@Override
	public void visit(RandomCoordinateController randomCoordinateController) {
		this.show("quita de", origin);
	}
	
}
