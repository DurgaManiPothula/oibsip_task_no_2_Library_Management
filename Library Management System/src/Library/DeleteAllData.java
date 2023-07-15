package Library;

import java.util.Scanner;

public class DeleteAllData implements IOOperation{

	@Override
	public void opr(Database database, User user) {
		// TODO Auto-generated method stub
		System.out.println("Are you sure that you want to delete all data????\n"
				+"1. Continue\n2. Main Menu");
		Scanner s = new Scanner(System.in);
		int i= s.nextInt();
		if(i==1)
		{
			database.deleteAllData();
		}
		else
		{
			user.menu(database, user);
	}

}
}
