package jenkins;

import org.testng.annotations.Test;

public class JenkinsTEst {

	
	@Test(groups = "regression")
	
	public void test1()
	{
		System.out.println("-- test-1 ---");
	}
	
	@Test(groups = "smoke")
	public void test2()
	{
		System.out.println("-- test-2 ---");
	}
}
