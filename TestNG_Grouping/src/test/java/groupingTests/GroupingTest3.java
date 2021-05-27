package groupingTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupingTest3 {
	

	@Test(priority=05, groups= {"cross browser", "acceptance"})
	public void loginTest() {
		System.out.println("This is a login test 03");
	}
	
	@Test(priority=04, groups= {"cross browser","exploratory","acceptance"})
	public void productTest() {
		System.out.println("This is a product test 03");
	}
	
	@Test(priority=03, groups= {"exploratory","acceptance"})
	public void featuresTest() {
		System.out.println("This is a features test 03");
	}
	
	@Test(priority=02, groups= {"cross browser", "acceptance"})
	public void checkoutTest() {
		System.out.println("This is a checkout test 03");
		Assert.assertEquals(5, 7);
	}
	
	@Test(priority=01, groups= {"cross browser"})
	public void trackingTest() {
		System.out.println("This is a Tracking test 03");
		Assert.assertEquals(8, 9);
	}

}
