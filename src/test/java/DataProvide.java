import org.testng.annotations.DataProvider;

public class DataProvide {
	
	@DataProvider(name = "data")
	public Object[][] dpMethod() {
		
		return new Object[][] {{1,2,3},{4,5,6}, {7,8,9}};
	}
	
	@DataProvider(name = "data")
	public Object[][] dpMethod1() {
		
		return new Object[][] {{1,2,3},{4,5,6}, {7,8,9}};
	}


	@DataProvider(name = "data")
	public Object[][] dpMethod2() {
		
		return new Object[][] {{1,2,3},{4,5,6}, {7,8,9}};
	}

}
