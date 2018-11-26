package amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
	
	/**
	 * This method captures the exact time of display start
	 * 
	 * 
	 * @param dateI Is and Object {@code Date} containing start time exactly.
	 * 	 
	 * @return Returning date and time captured
	 * */
	Date startToSee(Date dateI);
	
	
	/**
	 * This method captures start and end time of visualization exactly
	 * 
	 * @param dateI Is and Object {@code Date} containing start time exactly.
	 * @param dateF Is and Object {@code Date} containing end time exactly.
	 * */
	void stopToSee(Date dateI, Date dateF);
	
}
