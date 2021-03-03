package DevanshiShah_COMP228Sec402;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a new Object.
		//Book bookObj = new Book();
		Book scienceBookObj = new ScienceBook(null, null, null, 0, 0);
		Book childrenBookObj = new ChildrenBook(null, null, null, 0, 0);

		Scanner input = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null,"HELLO, ***Enter the Book Information for Science Book***"); 	
		// taking input from the user for Book Title for Science Book.
		String title = JOptionPane.showInputDialog("Enter the Book Title:");
		scienceBookObj.setBookTitle(title);
				
		// taking input from the user for Book ISBN for Science Book.
		String isbn = JOptionPane.showInputDialog("Enter the Book ISBN:");
		scienceBookObj.setBookISBN(isbn);

		// taking input from the user for Book Publisher Name for Science Book.
		String publisher = JOptionPane.showInputDialog("Enter the Book Publisher:");
		scienceBookObj.setBookPublisher(publisher);
				
		// taking input from the user for Book Publishing Year for Science Book.
		int year = Integer.parseInt(JOptionPane.showInputDialog("Enter the Book Publisher Year:"));
		scienceBookObj.setBookPublishedYear(year);
						
		// taking input from the user for Book Price for Science Book.
		double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the Book Price:"));
		scienceBookObj.setPrice(price);
		
		JOptionPane.showMessageDialog(null, "\n Book Information:"+ scienceBookObj.toString() +
				"\n Book Gnere: " + scienceBookObj.getGenre());
		
		
		JOptionPane.showMessageDialog(null,"HELLO,***Please Enter the Book Information for Children Book *** "); 	
		// taking input from the user for Book Title for Children Book.
		String ChildTitle = JOptionPane.showInputDialog("Enter the Book Title:");
		childrenBookObj.setBookTitle(ChildTitle);
		
		// taking input from the user for Book ISBN for Children Book.
		String childISBN = JOptionPane.showInputDialog("Enter the Book ISBN:");
		childrenBookObj.setBookISBN(childISBN);
		
		// taking input from the user for Book Publisher for Children Book.
		String childPublisher = JOptionPane.showInputDialog("Enter the Book publisher:");
		childrenBookObj.setBookPublisher(childPublisher);
				
		// taking input from the user for Book Published Year for Children Book.
		
		int childYear = Integer.parseInt(JOptionPane.showInputDialog("Enter the Book Publisher Year:"));
		childrenBookObj.setBookPublishedYear(childYear);
				
		// taking input from the user for Book Price for Children Book.
		double childPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter the Book Price:"));
		childrenBookObj.setPrice(childPrice);
		
		JOptionPane.showMessageDialog(null, "\n Science Book Information:"+ childrenBookObj.toString() +
				"\n Book Gnere: " + childrenBookObj.getGenre());
		
	}

}
