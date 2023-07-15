package Library;

import java.util.Scanner;

public class PlaceOrder implements IOOperation{

	@Override
	public void opr(Database database, User user) {
		// TODO Auto-generated method stub
		Order order = new Order();
		System.out.println("Enter book name: ");
		Scanner s = new Scanner(System.in);
		String bookname = s.next();
		int i=database.getBook(bookname);
		if(i<-1)
		{
			System.out.println("\nBook does not exist\n");
			
		}else {
			Book book = database.getBook(i);
			order.setBook(book);
			order.setUser(user);
			System.out.println("Enter qty:");
			int qty= s.nextInt() ;
			order.setQty(qty);
			order.setPrice(book.getPrice()*qty);
			int bookindex =database.getBook(book.getName());
			book.setQty(book.getQty()-1);
			database.addOrder(order, book, bookindex);
			System.out.println("\nOrder placed succesfully\n");
			
		}
		user.menu(database, user);
	}

}
