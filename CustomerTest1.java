import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CustomerTest1 {

	@Test
	public void test() {
			ArrayList<String[]> testCustomer = new ArrayList<String[]>(); 
			Customer c = new Customer();
			testCustomer=c.initCustomer();

			int i = testCustomer.size();
			assertEquals(i,6);
			
	}
}
