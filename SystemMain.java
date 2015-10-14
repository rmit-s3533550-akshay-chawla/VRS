import java.util.*;

    public class SystemMain {
	public static int user;
	public static Scanner read;
//	public static int flag = 0;

	public static void main(String[] args) {
		// Display Menu to customer
		boolean abc=false;
		
		do{
					
			displayMenu();		
//		 System.out.println("Do you want to continue?");
//		 Process choice
		processChoice();
		       
		} while(abc==true);
				
	}

	public static void processChoice() {
		read = new Scanner(System.in);
		int choice = read.nextInt();

		ArrayList<String[]> customer = new ArrayList<String[]>();
		Customer cust = new Customer();
		customer = cust.initCustomer();
		
		if (user == 1) {
			switch (choice) {
			case 1:
				// 1. Add new customer.
				cust.addCustomer(customer);
			break;
//return;
			case 2:
				// 2. Rent movie.
				System.out.println("Please input movie number");
				read = new Scanner(System.in);
				String movieNo = read.nextLine();
				System.out.println("Please input customer number");
				read = new Scanner(System.in);
				String custNo = read.nextLine();	
				Rent rent = new Rent(movieNo,custNo,customer);
				rent.rentMovie();
				break;
			case 3:
				// 3. Add movie info.
			
				ArrayList<String[]> movie = new ArrayList<String[]>();
				Movie mov = new Movie();
				movie = mov.movieInfo();
				mov.addMovie(movie);
				break;
			case 4:
				// 4. Add movie copy.
				ArrayList<String[]> movie_copy = new ArrayList<String[]>();
				movieCopy movC = new movieCopy();
				movie_copy = movC.movieC();
				movC.addMovieCopy(movie_copy);
				break;
			case 5:
				// 5. Return movie.
				System.out.println("Please input movie number");
				read = new Scanner(System.in);
				String movieNo_r = read.nextLine();
				System.out.println("Please input customer number");
				read = new Scanner(System.in);
				String custNo_r = read.nextLine();	
				Rent return_m = new Rent(movieNo_r,custNo_r,customer);
				return_m.returnMovie(customer,custNo_r);
				break;
				//return;
			default:
				System.out.println("You can only choose the options on the list!");
			}
		} else {
			switch (choice) {
			case 1:
				;
				break;
			case 2:
				;
				break;
			default:
				System.out.println("You can only choose the options on the list!");
			}
		}
	}

	public static void login() {
		String user;
		String pass;

		System.out.println("====LOG IN FORM====");
		System.out.println("\nEnter Valid UserName");

		read = new Scanner(System.in);
		user = read.nextLine();
		System.out.println("Enter Password");
		pass = read.nextLine();

		if (user.equals("aman") && pass.equals("123") || user.equals("akshay") && pass.equals("456")
				|| user.equals("cong") && pass.equals("789")) {
//			flag++;
			System.out.println("\n====LOG IN COMPLETE====");
		} else {
			System.out.println("\nPlease Enter Valid UserName Or Password");
		}
	}

	public static void displayMenu() {

		System.out.println("====Welcome to Alex Video Rental System====");
		System.out.println("\nIf you are a Clerk press 1.");
		System.out.println("If you are a Customer press 2.");

		read = new Scanner(System.in);
		user = read.nextInt();

		if (user == 1) {
			
			System.out.println("\n=============Welcome=============");
			System.out.println("Please input your selection:");
			System.out.println("1. Add new customer.         ");
			System.out.println("2. Rent movie.               ");
			System.out.println("3. Add movie info.           ");
			System.out.println("4. Add movie copy.           ");
			System.out.println("5. Return movie.                 ");
		} else if (user == 2) {
			System.out.println("=============Welcome=============");
			System.out.println("Please input your selection:");
			System.out.println("1. Search movie.         ");
			System.out.println("2. Reserve movie.       ");
		} else {
			System.out.println("You can ony input 1 or 2.");
		}
	}

}
