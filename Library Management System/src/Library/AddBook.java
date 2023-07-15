package Library;

import java.util.Scanner;

public class AddBook implements IOOperation{
	@Override
	public void opr(Database database, User user) {
		
		Scanner s =new Scanner(System.in);
		Book book =new Book();
		System.out.println("Enter Book name: ");
		String name =s.next();
		if(database.getBook(name)>-1) {
			System.out.println("There is a book with this name");
			
			user.menu(database, user);
		}else
		{
			book.setName(name);
		}
		System.out.println("Enter Book Author: ");
		book.setAuthor(s.next());
		System.out.println("Enter Book Publisher: ");
		book.setPublisher(s.next());
		System.out.println("Enter Collection Location: ");
		book.setAddress(s.next());
		System.out.println("Enter qty: ");
		book.setQty(s.next());
		System.out.println("Enter Book Price: ");
		book.setPrice(s.next());
		System.out.println("Enter Borrowing copies: ");
		book.setBrwcopies(s.next());
		database.AddBook(book);
		System.out.println("Book added successfully\n");
		user.menu(database,user);
		s.close();
		
	}

}
