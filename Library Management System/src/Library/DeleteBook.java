package Library;

import java.util.Scanner;

public class DeleteBook implements IOOperation{

	@Override
	public void opr(Database database, User user) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter book name for deletion: ");
		String bookname=s.next();
		int i=database.getBook(bookname);
		if(i>-1)
		{
			database.deleteBook(i);
			System.out.println("Book Deleted Successfully");
		}else {
			System.out.println("Book Does not exist");
		}
		
		user.menu(database, user);
	}
	
}
