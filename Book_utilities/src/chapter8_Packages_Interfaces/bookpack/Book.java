package chapter8_Packages_Interfaces.bookpack;

public class Book {
  protected String title;
  protected String author;
  protected int publicationDate;

  public Book(String title, String author, int publicationDate) {
    this.title = title;
    this.author = author;
    this.publicationDate = publicationDate;
  }

  public void show() {
    System.out.println(title);
    System.out.println(author);
    System.out.println(publicationDate);
  }
}
