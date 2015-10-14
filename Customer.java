import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends SystemMain{
    
	public ArrayList<String[]> initCustomer() {
		
		ArrayList<String[]> a = new ArrayList<String[]>(); 
		
		String s1[]= {"1","Karen","6   Grimwade Street","123@email.com","0415121191","standard","3"};
		String s2[]= {"2","Aman","7   Grimwade Street","456@email.com","0415121191","premium","1"};
		String s3[]= {"3","Akki   ","8   Grimwade Street","789@email.com","0415121191","standard","0"};
	    String s4[]= {"4","Lala   ","9   Grimwade Street","987@email.com","0415121191","standard","5"};
	    String s5[]= {"5","KKK  ","10  Grimwade Street","654@email.com","0415121191","standard","6"};
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		
		return a;
	}
	
	public void addCustomer(ArrayList<String[]> customer) {
		// Add customer information
		String id,name, address,email, phone,rating;
		
        int i = customer.size();
         i++;
		id = String.valueOf(i);
		
		
		System.out.println("Please input Customer Name:");
		Scanner read_name = new Scanner(System.in);
		name = read_name.nextLine() ;
		
		System.out.println("Please input Customer Address:");
		Scanner read_address = new Scanner(System.in);
		address = read_address.nextLine() ;
		
		System.out.println("Please input Customer Email:");
		Scanner read_email = new Scanner(System.in);
		email = read_email.nextLine() ;
	
		System.out.println("Please input Customer Phone Num:");
		Scanner read_phone = new Scanner(System.in);
		phone = read_phone.nextLine() ;
		
		System.out.println("Please input Customer Rating:");
		Scanner read_rating = new Scanner(System.in);
		rating = read_rating.nextLine() ;
		
		String s1[]= {id,name,address,email,phone,rating};
		customer.add(s1);
		System.out.println("New customer record created");
		
	    displayMenu();
	    processChoice();
	    
		
	}
	
		
	/* ----------------------------------------------------------------*/	
	public void printCustomer(ArrayList<String[]> customer) {
		String print[][] = (String[][]) customer.toArray(new String[0][0]); 
		for(int i = 0; i < print.length; i++){
			for(int j = 0; j < print[0].length; j++){
				System.out.print(print[i][j]+"    ");
			}
			System.out.println("");
		}
	}
/* ----------------------------------------------------------------*/	
	public int getDiscount( ArrayList<String[]> customer, String id ){
		
		int discount = 0;
		int i = Integer.parseInt(id);
		i--;
		String[] record = customer.get(i);
		String s =record[5];
		if(s=="premium"){
			discount=10;
		}
		//System.out.println(i);
		return discount;
	}	
	
	public int getMovieNum( ArrayList<String[]> customer, String id ){
		int i = Integer.parseInt(id);
		i--;
		String[] record = customer.get(i);
		String s = record[6];
		int num =Integer.parseInt(s);
		return num;
	}
	
	public void setMovieNum( ArrayList<String[]> customer, String id ,int num){
		int i = Integer.parseInt(id);
		i--;
		String[] record = customer.get(i);
		record[6] = num+"";
	}
	
	public String[] getCustomer(ArrayList<String[]> customer,String id){
		int i = Integer.parseInt(id);
		i--;
		String[] record = customer.get(i);
		return record;
	}
}
