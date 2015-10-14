
import java.util.*;
import java.io.*;

public class Movie extends SystemMain {

	public ArrayList<String[]>  movieInfo(){
		
		ArrayList<String[]> m = new ArrayList<String[]>(); 
		
		String m1[]={"Avengers","Action","20","3","2011","5" };
		String m2[]={"Godfather","drama","30","3","1972","5" };
		m.add(m1);
		m.add(m2);
		return m;
	}

	public void addMovie(ArrayList<String[]> movie)
	{
		String name, category, charges, period, year, overdue;
		
		System.out.println("Please input Movie Name:");
		Scanner read_name = new Scanner(System.in);
		name = read_name.nextLine() ;
		
		System.out.println("Please input Category:");
		Scanner read_category = new Scanner(System.in);
		category = read_category.nextLine() ;
		
		System.out.println("Please input Movie charges ($):");
		Scanner read_charges = new Scanner(System.in);
		charges = read_charges.nextLine() ;
	
		System.out.println("Please input Rental-Period (days allowed):");
		Scanner read_period = new Scanner(System.in);
		period = read_period.nextLine() ;
		
		System.out.println("Please input Year of Release:");
		Scanner read_release = new Scanner(System.in);
		year = read_release.nextLine() ;
		
		System.out.println("Please input Overdue charges ($)");
		Scanner read_overdue = new Scanner(System.in);
		overdue = read_overdue.nextLine();
		
		String s1[]= {name, category, charges, period, year, overdue};
		movie.add(s1);
		System.out.println("New Movie Record Created");
		
		displayMenu();
		processChoice();
	}

	public void add(String[] m1) {
		// TODO Auto-generated method stub
		
	}
	
	public void getMovieInfoArray(ArrayList<String> m) {
		
		String[][] movieInfoArray = (String[][]) m.toArray(new String[0][0]);
	}
	
	
	public void searchByName(String[][] movieInfoArray){
		
		 String mvName;
		 boolean found;
		 int i;
		 i = 0;
		 found = false;
		
		 System.out.println("Please enter the name of the movie");
	     Scanner sc = new Scanner(System.in);
	
	     mvName = sc.nextLine();
	     
	     for(i=0; i < movieInfoArray.length; i++) {
	    	 
	 
	     if (movieInfoArray[i][0].contains(mvName)) {
	    	  
	    	  System.out.println(movieInfoArray[i][0] + " - " + movieInfoArray[i][4]);
	    	  
	    	  found = true;
	    	  
	         }
	     }
	     
	     if (!found) {
	    	  
	    	  System.out.println("No results found.");
	      }
		
	}
	
	public void searchByCategory(String[][] movieInfoArray) {
		
		int option = 0;
		String categ;
		int j;
		j = 0;
		
		while (option !=1 && option !=2 && option !=3 && option !=4 ){
		System.out.println("Please select one of the below:");
		System.out.println("1. Comedy");
		System.out.println("2. Action");
		System.out.println("3. Family");
		System.out.println("4. Drama");
		}
		
		Scanner scn = new Scanner(System.in);
		option = scn.nextInt();
		
		
		if (option == 1) {
			categ = "comedy";
		} else if (option == 2) {
			categ = "action";
		} else if (option == 3) {
			categ = "family";
		} else {
			categ = "drama";
		}
		
		for(j=0; j < movieInfoArray.length; j++) {
			
			if (movieInfoArray[j][1] == categ) {
		    	  
		    	  System.out.println(movieInfoArray[j][0] + " - " + movieInfoArray[j][4]);
		    	  System.out.println(movieInfoArray[j][1]);
		    }
		
		}
	}
	
}
