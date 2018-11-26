package main.java.ticTacToe.views.console;

import main.java.ticTacToe.View;
import main.java.ticTacToe.controllers.ColocateController;
import main.java.ticTacToe.controllers.ContinueController;
import main.java.ticTacToe.controllers.OperationController;
import main.java.ticTacToe.controllers.StartController;

public class ConsoleView implements View {
	
	private StartView startView;
	
	private GameView gameView;
	
	private ContinueView continueView;
	
	public ConsoleView(){
		startView = new StartView();
		gameView = new GameView();
		continueView = new ContinueView();
	}

	public void interact(OperationController operationController) {
		assert operationController != null;
		operationController.accept(this);
	}
	
	@Override
	public void visit(StartController startController) {
		startView.interact(startController);
	}
	
	@Override
	public void visit(ColocateController colocateController) {
		gameView.interact(colocateController);
	}

	@Override
	public void visit(ContinueController continueController) {
		continueView.interact(continueController);
	}

}
