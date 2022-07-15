import java.util.Iterator;

public class ExceptionDemo {

	int var1 = 20;
	int var2 =10;

	public void calculateNumbers() {

		try {
			System.out.println(var1 / var2);
		}
		
		catch (Exception e) {
			
		}
		
		finally {
			
			System.out.println("good bye");
		}
		
		System.out.println(var1+var2);
		
		
	}

	public static void main(String[] args) {
		
		ExceptionDemo demo = new ExceptionDemo();
		
		demo.calculateNumbers();

	}
}
