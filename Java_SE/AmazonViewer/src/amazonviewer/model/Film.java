package amazonviewer.model;


/**
 * <h1>Film</h1>
 * Film is a abstract super class
 * <p>
 * This class is the base class of Films family. It is abstract, 
 * therefore you can not create instances. It contains the abstract method 
 * {@code view ()} that is mandatory to implement for anyone who belongs to that family.
 * 
 * 
 * @author silex189
 * @version 1.2
 * @since 2018
 * */
public abstract class Film {
	
	private String title;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	
	
	public Film() {}
	public Film(String title, String genre, String creator, int duration) {
		this.title = title;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public String isViewed() {
		String visto = "";
		if(viewed == true) {
			visto = "Sí";
		}else {
			visto = "No";
		}
		
		return visto;
	}
	
	public boolean getIsViewed() {
		return viewed;
	}
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	
	/**
	 * {@code view()} it is an obligatory abstract method to be implemented
	 * */
	public abstract void view();

}









