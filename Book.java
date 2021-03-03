package DevanshiShah_COMP228Sec402;
//abstract class which will contain ScienceBook and ChildrenBook as their subclass.
public abstract class Book {
	
	// declaring variables of Book class
	private String bookTitle;
	private String bookISBN;
	private String bookPublisher;
	protected double bookPrice;
	private int bookPublishedYear;
	
	// constructor of abstract class Book
	public Book(String bookTitle, String bookISBN, String bookPublisher,double bookPrice, int bookPublishedYear) {
		this.bookTitle = bookTitle;
		this.bookISBN = bookISBN;
		this.bookPublisher = bookPublisher;
		this.bookPrice = bookPrice;
		this.bookPublishedYear = bookPublishedYear;
	}
	
	// setter methods of abstract class Book
	public void setBookTitle(String bookTitle) {
		// Validating for Book Title and exception handling.
		if(bookTitle == null || bookTitle.length() <= 0) {
			throw new IllegalArgumentException();
		}
		this.bookTitle = bookTitle;
	}
	public void setBookISBN(String bookISBN) {
		// Validating Validating for Book ISBN number and exception handling.
		if(bookISBN == null || bookISBN.length() <= 0) {
			throw new IllegalArgumentException();
		}
		this.bookISBN = bookISBN;
	}
	public void setBookPublisher(String bookPublisher) {
		// Validating Validating for Book Publisher  and exception handling.
		if(bookPublisher == null || bookPublisher.length() <= 0) {
			throw new IllegalArgumentException();
		}
		this.bookPublisher = bookPublisher;
	}
	public void setBookPublishedYear(int bookPublishedYear) {
		//  Validating for Book Published Year and exception handling.
		if(bookPublishedYear <= 0) {
			throw new IllegalArgumentException();
		}
		this.bookPublishedYear = bookPublishedYear;
	}
	
	// getter methods for Abstract class Book.
	public String getBookTitle() {
		return bookTitle;
	}
	public String getBookISBN() {
		return bookISBN;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
//	public double getBookPrice() {
//		return bookPrice;
//	}
	public int getBookPublishedYear() {
		return bookPublishedYear;
	}
	
	// toString method
	public String toString() {
        return bookTitle + "\n" + bookISBN + "\n" + bookPublisher+ "\n" + bookPrice + "\n" + bookPublishedYear ;
    }
	
	// an abstract method setPrice(double price) to determine the price for a book
	abstract void setPrice(double price);
	// abstract method getGenre() to return the genre of the book
	abstract String getGenre();

}
