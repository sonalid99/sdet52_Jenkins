package jenkins;

import org.testng.annotations.Test;

public class DemoTest extends BaseParameters {

	@Test(groups = "regression")
	public void demoTest()
	{
		System.out.println("-- demo1 test --");
	}
	
	@Test
	public void demo2Test()
	{
		System.out.println("-- demo2 test --");
		System.out.println("hii");
	}
	
	@Test
	public void demo3Test()
	{
		System.out.println("-- demo3 test --");
		System.out.println("byeee");
	}
}
