import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void LoginPage() {
		
		System.out.println("test case 1");
	}
	
	@Test(priority = -1)
	public void Homepage() {
		
		System.out.println("test case 2");
	}
	
	@Test(priority = 1)
	public void Cart() {
		
		System.out.println("test case 3");
	}
	
	@Test(priority = 2)
	public void Payment() {
		
		System.out.println("test case 4");
	}
	
	

}
