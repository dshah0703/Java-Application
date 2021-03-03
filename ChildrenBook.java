package DevanshiShah_COMP228Sec402;
//Child class(ChildrenBook) of Book Class
public class ChildrenBook extends Book{

	public ChildrenBook(String bookTitle, String bookISBN, String bookPublisher, double bookPrice,
			int bookPublishedYear) {
		super(bookTitle, bookISBN, bookPublisher, bookPrice, bookPublishedYear);
		// TODO Auto-generated constructor stub
	}
//Overriding the abstract method setPrice(double price)
	@Override
	void setPrice(double price) {
		// TODO Auto-generated method stub
		bookPrice = price;
		
	}
//Overriding the abstract method getGenre()
	@Override
	String getGenre() {
		// TODO Auto-generated method stub
		// System.out.println("Children");
		return "ChildrenBook";
	}
	
	
}