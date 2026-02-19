package Libraray_management_ques1;

public class Book extends LibraryItem {

	private String author;

	public Book(String author) {

		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	void displayDetails() {
		System.out.println("Book - " + author + " " + getTitle() + " " + getItemID());
	}

}
