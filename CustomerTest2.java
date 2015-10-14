import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CustomerTest2 {

	@Test
	public void test() {
		ArrayList<String[]> testCustomer = new ArrayList<String[]>(); 
		Customer c = new Customer();
		testCustomer=c.initCustomer();

		c.addCustomer(testCustomer);
		int m = testCustomer.size();
		assertEquals(m,6);
	}
}
