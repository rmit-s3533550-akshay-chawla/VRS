
import java.util.*;

public class Search {
	
	 
	String mvName;
	Boolean found;
	int option; 
	
	Search() {
	
		found = false;
	}

	public static void main(String[] args) {
		

	}
	
	 public void searchByName(ArrayList<String> m) {
		
	     System.out.println("Please enter the name of the movie");
	     Scanner sc = new Scanner(System.in);
	
	      mvName = sc.nextLine();
	      
	     
	      String m1[] ={"the end","comedy","","","1996",""};
	      
	      
	      
	      int i;
	      i = 0;
	      
	      String s;
	      
	      while(i < 100) {
	      if (m[s].[0].contains(mvName)) {
	    	  
	    	  System.out.println(m[s].[0] + " - " + m[s].[4]);
	    	  
	    	  found = true;
	    	  
	    	  
	      } else if (i == 99 && !found) {
	    	  
	    	  System.out.println("No results found.");
	      }
		
	      i++;
	}
	
	
		
	}

	public void searchByCategory(ArrayList<String> m) {
		
		int option = 0;
		while (option !=1 && option !=2 && option !=3 && option !=4 ){
		System.out.println("Please select one of the below:");
		System.out.println("1. Comedy");
		System.out.println("2. Action");
		System.out.println("3. Family");
		System.out.println("4. Drama");
		
		
		Scanner scn = new Scanner(System.in);
		option = scn.nextInt();
		}
		
		
		String categ;
		if (option == 1) {
			categ = "comedy";
		} else if (option == 2) {
			categ = "action";
		} else if (option == 3) {
			categ = "family";
		} else {
			categ = "drama";
		}
		
	      
	      m[0] = "the end";

	      
	      int i;
	      i = 0;
	      
	      
	      while(i < 100) {
	       
	    	  
	    	 }
		  i++; 
		  }

	      
}

}
