package TESTNGTopics;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


//@Test(enabled=false)
public class IgnoreDemo {
	
	
	@Test(enabled=false)
	
	public void test1() {
		System.out.println(" I am inside Test 1");
	}

	@Test
	public void test2() {
		System.out.println(" I am inside Test 2");
	}
}
