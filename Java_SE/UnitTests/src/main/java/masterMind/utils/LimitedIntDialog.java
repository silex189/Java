package main.java.masterMind.utils;

import main.java.masterMind.utils.ClosedInterval;

public class LimitedIntDialog {

	private String title;
	
	private ClosedInterval limits;
	
	private ClosedIntervalView limitsView;
	
	public LimitedIntDialog(String title, ClosedInterval limits){
		assert title != null;
		assert limits != null;
		this.limits = limits;
		limitsView = new ClosedIntervalView("El valor debe estar entre ", limits);
		this.title = title + " " + limitsView + ": ";
	}
	
	public LimitedIntDialog(String title, int max){
		this(title, new ClosedInterval(1,max));
	}
	
	public int read(){
		IO io = new IO();
		int value;
		boolean ok;
		do {
			value = io.readInt(title);
			ok = limits.includes(value);
			if (!ok) {
				limitsView.writeln();
			}
		} while (!ok);
		return value;
	}
}
