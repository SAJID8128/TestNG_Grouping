package groupingTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupingTest2 {
	

	@Test(priority=01, groups= {"equivalence partitioning"})
	public void loginTest() {
		System.out.println("This is a login test 02");
	}
	
	@Test(priority=03, groups= {"boundary value", "equivalence partitioning"})
	public void productTest() {
		System.out.println("This is a product test 02");
		Assert.assertEquals(3, 4);
	}
	
	@Test(priority=04, groups= {"decision table","equivalence partitioning"})
	public void featuresTest() {
		System.out.println("This is a features test 02");
	}
	
	@Test(priority=05, groups= {"boundary value", "equivalence partitioning"})
	public void checkoutTest() {
		System.out.println("This is a checkout test 02");
	}
	
	@Test(priority=02, groups= {"boundary value","decision table"})
	public void trackingTest() {
		System.out.println("This is a Tracking test 02");
	}

}
