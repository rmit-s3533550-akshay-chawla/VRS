
import java.util.*;

public class movieCopy extends Movie{

	public ArrayList<String[]>  movieC(){
		
		ArrayList<String[]> m = new ArrayList<String[]>(); 
		
		String m1[]={"001","date","good","available","10" };
		String m2[]={"002","date","damaged","on loan","20" };
		m.add(m1);
		m.add(m2);
		return m;
		
	}
	public void addMovieCopy(ArrayList<String[]> movie)
	{
		String id, date_purchased, condition, status, no_times;
		
		System.out.println("Please input Movie ID:");
		Scanner read_id = new Scanner(System.in);
		id = read_id.nextLine() ;
		
		System.out.println("Please input Date Purchased:");
		Scanner read_date = new Scanner(System.in);
		date_purchased = read_date.nextLine() ;
		
		System.out.println("Please input Movie condition(Good or Damaged):");
		Scanner read_condition = new Scanner(System.in);
		condition = read_condition.nextLine() ;
	
		System.out.println("Please input Movie Status(Available or Loan):");
		Scanner read_status = new Scanner(System.in);
		status = read_status.nextLine() ;
//		
//		System.out.println("Please input Number of Times Rented:");
//		Scanner read_rented = new Scanner(System.in);
//		no_times = read_rented.nextLine() ;
		
		
		System.out.println("New Movie Record Created");
		
		displayMenu();
		processChoice();
	}
	
	
	
}
