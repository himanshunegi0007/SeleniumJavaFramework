
public class ExceptionDemo1 {
	public static void main(String[] args) {
		
		try
		{
		System.out.println("I am in Try");	
		int i=2/0;
		System.out.println("I am after exception in try");	
		

		}
		catch(Exception e){
			System.out.println("Handeled here");
			System.out.println("the message is"+e.getMessage());
			
			System.out.println("the sorce is is"+e.getCause());

			
		}
		finally
		{
			System.out.println("I am inside finally");
		}
		}
		}
		
	


