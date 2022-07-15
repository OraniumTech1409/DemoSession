import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv {
	
	@Test(dataProvider = "data", dataProviderClass = DataProvide.class)
	public void Login(int a , int b, int result) {
		
		int sum = a +b;
		
		Assert.assertEquals(result, sum);
	}

}
