package samples;

class Image {
	
	Clickable clickable = () -> {
		System.out.println("You've clicked me!");
	};
	
	void onClick() {
		clickable.click();
	}

}
