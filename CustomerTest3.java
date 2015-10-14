import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CustomerTest3 {

	@Test
	public void test() {
		ArrayList<String[]> testCustomer = new ArrayList<String[]>(); 
		Customer c = new Customer();
		testCustomer=c.initCustomer();
		int discount=c.getDiscount(testCustomer, "3");
		assertEquals(discount,10);
	}

}
