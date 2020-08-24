
public class ExceptionDemo2 {
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
		int i=2/0;
		System.out.println("I am after exception in try");	
		
		}
		
		
		
		}
		
	


