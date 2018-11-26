package main.java.ticTacToe.views.console;

import main.java.ticTacToe.controllers.CoordinateController;
import main.java.ticTacToe.controllers.RandomCoordinateController;
import main.java.ticTacToe.controllers.UserCoordinateController;
import main.java.ticTacToe.models.Coordinate;

class PutTargetCoordinateView extends ColocateCoordinateView {

	private Coordinate target;

	PutTargetCoordinateView(CoordinateController coordinateController) {
		super(coordinateController);
	}		
		
	Coordinate getCoordinate(){
		target = this.getCoordinateController().getTarget();
		this.getCoordinateController().accept(this);
		return target;
	}

	@Override
	public void visit(UserCoordinateController userCoordinateController) {
		new CoordinateView("En", target).read();
	}

	@Override
	public void visit(RandomCoordinateController randomCoordinateController) {
		this.show("pone en", target);
	}

}
