import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void test1() {
		
		System.out.println("test case 1");
	}
	
	@Test
	public void test2() {
		
		System.out.println("test case 2");
	}
	
	@BeforeClass
	public void test3() {
		
		System.out.println("before class");
	}
	
	@BeforeTest
	public void test4() {
		
		System.out.println("before test");
	}
	
	@AfterTest
	public void test5() {
		
		System.out.println("after test");
	}
	
	@AfterClass
	public void test6() {
		
		System.out.println("after class");
	}
	
	@BeforeSuite
	public void test7() {
		
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void test8() {
		
		System.out.println("after suite");
	}

	
	@BeforeMethod
	public void test9() {
		
		System.out.println("before method");
	}
	
	@AfterMethod
	public void test10() {
		
		System.out.println("after method");
	}

}
