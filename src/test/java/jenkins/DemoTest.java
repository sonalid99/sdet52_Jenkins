package jenkins;

import org.testng.annotations.Test;

public class DemoTest {

	@Test(groups = "regression")
	public void demoTest()
	{
		System.out.println("-- demo1 test --");
	}
	
	@Test
	public void demo2Test()
	{
		System.out.println("-- demo2 test --");
	}
}
