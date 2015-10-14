import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Loan {

	ArrayList<String[]> loan = new ArrayList<String[]>(); 
    
	Loan(){
		String s1[] =  {"1","11-5-2015","11-6-2015","","","active"};
		String s2[] =  {"2","21-3-2015","21-4-2015","10-4-2015","20.00","completed"};
		String s3[] =  {"3","11-6-2015","11-7-2015","","","active"};
		String s4[] =  {"4","21-1-2015","21-2-2015","10-2-2015","20.00","completed"};
		loan.add(s1);
		loan.add(s2);	
		loan.add(s3);
		loan.add(s4);	

	}
	
	public void addLoan(){
		Date date = null;

		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

		String id,rental_date, due_date,return_date,charge, status;
	     return_date = null;
	     charge = null;
	     
        int i = loan.size();
         i++;
         id = i+"";
         rental_date = df.format(new Date());
         System.out.println("Please input due date:");
	     Scanner read = new Scanner(System.in);
	     due_date = read.nextLine();
	     status = "active";

	     String s[] = {id,rental_date, due_date,return_date,charge, status};
         System.out.println("Loan record created, ID: "+ s[0]+" Due Date is "+due_date);
	}
}
