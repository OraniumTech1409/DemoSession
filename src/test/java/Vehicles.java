import javax.security.auth.login.FailedLoginException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Vehicles {

	@Test()
	public void petrol() {

		System.out.println("car is running with petrol");
		
	}

	@Test(enabled = false)
	public void diesel() {

		System.out.println("car is running with diesel");

	}

	@Test()
	public void car() {

		System.out.println("car is running");
	}

}
