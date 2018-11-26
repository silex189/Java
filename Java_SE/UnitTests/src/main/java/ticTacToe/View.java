package main.java.ticTacToe;

import main.java.ticTacToe.controllers.OperationController;
import main.java.ticTacToe.controllers.OperationControllerVisitor;

public interface View extends OperationControllerVisitor {

	public void interact(OperationController operationController);
}
