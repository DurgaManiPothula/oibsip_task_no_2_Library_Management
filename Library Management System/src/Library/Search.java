package Library;

import java.util.Scanner;

public class Search implements IOOperation{

	@Override
	public void opr(Database database, User user) {
		// TODO Auto-generated method stub
		System.out.println("Enter book name");
		Scanner s = new Scanner(System.in);
		String name =s.next();
		int i =database.getBook(name);
		if(i>-1)
		{
			System.out.println("\n"+database.getBook(i).toString());
			//System.out.println("Book Deleted Successfully");
		}else {
			System.out.println("\nBook Does not exist\n");
		}
		
		user.menu(database, user);
	}

}
