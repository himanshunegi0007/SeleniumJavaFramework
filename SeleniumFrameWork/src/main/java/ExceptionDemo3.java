
public class ExceptionDemo3 {
	public static void main(String[] args) {
		
		try {
			demo();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

		
		
		public static void demo()throws Exception
		{
		System.out.println("I am in Try");	
		throw new ArithmeticException();


		}
		
		
		
		}
		
	


