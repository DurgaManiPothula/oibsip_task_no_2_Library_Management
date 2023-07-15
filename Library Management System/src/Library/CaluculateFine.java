package Library;

import java.util.Scanner;

public class CaluculateFine implements IOOperation{

	@Override
	public void opr(Database database, User user) {
		// TODO Auto-generated method stub
		System.out.println("Enter Book Name:");
		Scanner s = new Scanner(System.in);
		String bookname = s.next();
		boolean done =true;
		
		for(Borrowing b :database.getbrws()) {
			if(b.getBook().getName().matches(bookname) && 
					b.getUser().getName().matches(user.getName())) {
				System.out.println(b.getDaysLeft());
				if(b.getDaysLeft()>0)
				{
					System.out.println("You are late \n" +"You have to pay " + Math.abs(b.getDaysLeft()*50)+" as fine\n");
				}else {
					System.out.println("You need not to pay fine\n");
				}
				done =false;
				break;
			}
		}
		if(done)
		{
			System.out.println("You did not  borrow this book\n");
		}
		user.menu(database, user);
		
	}

}
