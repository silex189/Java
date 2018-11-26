package main.java.masterMind;

import main.java.masterMind.models.Game;
import main.java.masterMind.models.Limits;
import main.java.masterMind.presenters.LimitsPresenter;
import main.java.masterMind.presenters.GamePresenter;
import main.java.masterMind.views.MainView;

public class MasterMind {

	public MasterMind() {
		Limits limits = new Limits();
		Game game = new Game(limits);
		LimitsPresenter limitsPresenter = new LimitsPresenter(limits);
		GamePresenter gamePresenter = new GamePresenter(game);
		new MainView(limitsPresenter, gamePresenter);
	}
	
	public static void main(String[] args){
		new MasterMind();
	}
}
