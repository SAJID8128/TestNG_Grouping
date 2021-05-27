package groupingTests;

import org.testng.annotations.Test;
import org.testng.Assert;

public class GroupingTest1 {
	

	@Test(priority=01, groups= {"smoke","functional"})
	public void loginTest() {
		System.out.println("This is a login test 01");
		Assert.assertEquals(3, 4);
	}
	
	@Test(priority=02, groups= {"smoke","functional","regression"})
	public void productTest() {
		System.out.println("This is a product test 01");
	}
	
	@Test(priority=03, groups= {"smoke","regression"})
	public void featuresTest() {
		System.out.println("This is a features test 01");
	}
	
	@Test(priority=05,groups= {"smoke","functional"})
	public void checkoutTest() {
		System.out.println("This is a checkout test 01");
	}
	
	@Test(priority=06,groups= {"functional","regression"})
	public void trackingTest() {
		System.out.println("This is a Tracking test 01");
	}

}
