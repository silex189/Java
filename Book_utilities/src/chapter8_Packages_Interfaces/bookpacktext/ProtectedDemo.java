package chapter8_Packages_Interfaces.bookpacktext;

class ExtBook extends chapter8_Packages_Interfaces.bookpack.Book {
	private String publisher;

	public ExtBook(String title, String author, int publicationDate, String publisher) {
		super(title, author, publicationDate);
		this.publisher = publisher;
	}

	public void show() {
		super.show();
		System.out.println(publisher);
		System.out.println();
	}

	public String getPublisher() { return publisher; }
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTitle() { return title; }
	public void setTittle(String title) { this.title = title; }
	public String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }
	public int getPublicationDate() { return publicationDate; }
	public void setPublicationDate(int publicationDate) {
		this.publicationDate = publicationDate;
	}

}

public class ProtectedDemo {

	public static void main(String[] args) {
		ExtBook books[] = new ExtBook[5];

		books[0] = new ExtBook("Java: A Beginner's Guide", "Schildt", 2014, "McGraw-Hill");
		books[1] = new ExtBook("Java: The Complete Reference", "Schildt", 2014, "McGraw-Hill");
		books[2] = new ExtBook("The Art of Java", "Schildt and Holmes", 2003, "McGraw-Hill");
		books[3] = new ExtBook("Red Storm Rising", "Clancy", 1986, "Putnam");
		books[4] = new ExtBook("On the Road", "kerouac", 1955, "Viking");

		for (int i = 0; i < books.length; i++) {
			books[i].show();
		}

		System.out.println("Showing all books by Schildt.");
		for (int i = 0; i < books.length; i++) {
			if (books[i].getAuthor() == "Schildt") {
				System.out.println(books[i].getTitle());
			}
		}

		// books[0].title = "test title";

	}

}
