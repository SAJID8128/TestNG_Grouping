package groupingTests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	

	@Test(priority=01)
	@Parameters("Login")
	public void loginTest(String login) {
		System.out.println("This is a "+login);
	}
	
	@Test(priority=02)
	@Parameters("Product")
	public void productTest(String product) {
		System.out.println("This is a "+product);
	}
	
	@Test(priority=03)
	@Parameters("Feature")
	public void featuresTest(String feature) {
		System.out.println("This is a "+feature);
	}
	
	@Test(priority=05)
	@Parameters("Checkout")
	public void checkoutTest(String checkout) {
		System.out.println("This is a "+checkout);
	}
	
	@Test(priority=06)
	@Parameters({"Track"})
	public void trackingTest(String track) {
		System.out.println("This is a "+track);
	}

}
