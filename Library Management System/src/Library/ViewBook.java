package Library;

import java.util.ArrayList;

public class ViewBook implements IOOperation{

	@Override
	public void opr(Database database, User user) {
		// TODO Auto-generated method stub
		//System.out.println("View BOoks");
		ArrayList<Book> books = database.getAllBooks();
		System.out.println("Name\tAuthor\t\tPublisher\tAddress\tQty\tPrice\tNo.of Copies");
		for(Book b :books) {
			System.out.println(b.getName()+"\t"+b.getAuthor()+"\t\t"+b.getPublisher()+"\t"+b.getAddress()+"\t"+b.getQty()+"\t"+b.getPrice()+"\t"+b.getBrwcopies());
			
		}
		System.out.println();
		user.menu(database, user);
		
	}

}
