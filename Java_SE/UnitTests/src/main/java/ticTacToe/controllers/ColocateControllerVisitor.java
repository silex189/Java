package main.java.ticTacToe.controllers;

public interface ColocateControllerVisitor {

	void visit(PutController putController);
	
	void visit(MoveController moveController);
}
