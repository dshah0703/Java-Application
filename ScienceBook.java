package DevanshiShah_COMP228Sec402;
//Child class(ScienceBook) of Book Class
public class ScienceBook extends Book{

	public ScienceBook(String bookTitle, String bookISBN, String bookPublisher, double bookPrice,
			int bookPublishedYear) {
		super(bookTitle, bookISBN, bookPublisher, bookPrice, bookPublishedYear);
		
	}
	//Overriding the abstract method setPrice(double price)
	@Override
	void setPrice(double price) {
		
		bookPrice = price-(price*0.10);
	}
	//Overriding the abstract method getGenre()
	@Override
	String getGenre() {
		//System.out.println("Science");
		return "ScienceBook";
	}

}
