package Library;
import java.util.Scanner;

public class Main {
	static Scanner  sc;
	static Database database;
	public static void main(String[] args) {
		
	
		 database =new Database();
		 System.out.println("Welcome to Library Management System\n");
		 int num;
		 
		 System.out.println("0.Exit\n" + 
				 			"1.Login\n"
				 		   + "2.New User");
		 
				sc = new Scanner(System.in);
				num =sc.nextInt();
				 switch(num)
				 {
				 case 1 : login();  break;
				 case  2: newUser(); break;
				 }
	}
	
	 private  static void login()
	 {
		 System.out.println("Enter  phone number");
		 String phoneNumber =sc.next();
		 System.out.println("Enter email");
		 String email =sc.next();
		 int n =database.login(phoneNumber, email);
		 
		 if(n!=-1)
		 {
			 User user = database.getUser(n);
			 //System.out.println("Welcome "+ user.getName());
			 user.menu( database,  user);
			 
		 }else
		 {
			 System.out.println("User doesnot exist");
		 }
		 
	 }
	 
	 
	 public static void newUser()
	 {
		 System.out.println("Enter your name");
		 String name =sc.next();
		 if(database.userExists(name)) {
			 System.out.println("User already exists");
			 newUser();
		 }
		 System.out.println("Enter  phone number");
		 String phoneNumber =sc.next();
		 System.out.println("Enter your email");
		 String email =sc.next();
		 
		 System.out.println("1.Admin\n2.Normal User");
		 int n2 = sc.nextInt();
		 User user;
		 if(n2==1)
		 {
			 user = new Admin(name, email, phoneNumber);
		 }else {
			  user = new NormalUser(name, email, phoneNumber);
		 }
		 database.AddUser(user);
		 user.menu(database, user);
	 }
}

