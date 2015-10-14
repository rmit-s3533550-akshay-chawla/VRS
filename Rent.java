import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Rent extends SystemMain {
	String movieNo;
	String custNo;
	ArrayList<String[]> customer;

	public Rent(String mNo, String cNo, ArrayList<String[]> cust) {
		movieNo = mNo;
		custNo = cNo;
		customer = cust;
	}

	public void rentMovie() {

		Customer c = new Customer();
		String[] cust = new String[7];

		int num = c.getMovieNum(customer, custNo);
		if (num > 5) {
			System.out.println("Client have already rent 5 movies.");
			
		} else {
			num++;
			c.setMovieNum(customer, custNo, num);
			cust = c.getCustomer(customer, custNo);
			System.out.println("Movie rent successfully!");
			System.out.println("Customer " + cust[1] + " already rent " + cust[6] + " movies .");
			Loan loan_r = new Loan();
			loan_r.addLoan();
		}
		displayMenu();
		processChoice();
		
	}

	public void returnMovie(ArrayList<String[]> customer, String custNo_r) {
		System.out.println("Please input loan ID.");
		Scanner read = new Scanner(System.in);
		String loanid = read.nextLine();
		int loan_id = Integer.parseInt(loanid);
		loan_id--;
		Loan loan_r = new Loan();
		System.out.println("LOANID" + loan_id);

		ArrayList<String[]> loanarray = new ArrayList<String[]>();
		loanarray = loan_r.loan;
		String[] loaninfo = loanarray.get(loan_id);

		System.out.println("Movie Rented on " + loaninfo[1]);
		System.out.println("Due to  " + loaninfo[2]);

		double charge = 20.00;

		Customer c = new Customer();
		customer = c.initCustomer();
		int discount = c.getDiscount(customer, custNo_r);
		if (discount != 0) {
			charge = charge * 0.9;
		}

		System.out.println("It this within due date. 0: No / 1: Yes");
		read = new Scanner(System.in);
		int ifDue = read.nextInt();
		if (ifDue == 1) {
			charge = charge + 10.00;
		}

		System.out.println("Is there any damage.  0: No / 1: Yes");
		read = new Scanner(System.in);
		int ifDamage = read.nextInt();
		if (ifDamage == 1) {
			charge = charge + 15.00;
		}

		
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String return_date = df.format(new Date());

        loaninfo[3] = return_date;
		loaninfo[4] = charge+"";
		loaninfo[5] = "completed";
		
		for(int m = 0; m < 6; m++){
			System.out.println(loaninfo[m]);

		}
        
		System.out.println("Total charge is " + charge + " !");
		System.out.println("Return Accomplished!");
		displayMenu();
		processChoice();
	}
}
