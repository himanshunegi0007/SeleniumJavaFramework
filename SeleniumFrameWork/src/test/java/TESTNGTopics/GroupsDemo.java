package TESTNGTopics;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Test (groups={"AllTestClassLevel"})
public class GroupsDemo {

	@Test (groups={"sanity"})
	public void test2()
	{
		System.out.println("I am test 2");
	}
	
	@Test (groups={"sanity","regression"})
	public void test3()
	{
		System.out.println("I am test 3");
	}
	
	@Test (groups={"smoke","sanity"})
	public void test4()
	{
		System.out.println("I am test 4");
	}
	
	@Test (groups={"regression"})
	public void test5()
	{
		System.out.println("I am test 5");
	}
	
	@Test (groups={"sanity"})
	public void test6()
	{
		System.out.println("I am test 6");
	}
	}
	

