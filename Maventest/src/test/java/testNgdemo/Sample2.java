package testNgdemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample2 {
	
	@Parameters({ "browser" })
	@Test(priority=1)
	public void testCaseOne(String brow) {
		System.out.println("browser passed as :- " + brow);
	}

	@Parameters({ "username", "password" })
	@Test(priority=2)
	public void testCaseTwo(String user, String pass) {
		System.out.println("Parameter for User Name passed as :- " + user);
		System.out.println("Parameter for Password passed as :- " + pass);
	}
}