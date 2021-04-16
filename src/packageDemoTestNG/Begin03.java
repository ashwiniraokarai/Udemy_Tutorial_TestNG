package packageDemoTestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Begin03 {
	@Test(groups= {"smoke"})
	public void demo4(){
		System.out.println("From inside of Begin03 class and demo4() method");
	}
	
	@BeforeSuite
	public void begin() {
		System.out.println("From inside Begin03 class, begin() method:\nI get to go first in this SUITE");
	}
	
	@Parameters({"url"})
	@Test
	public void demo5(String urlName) {
		System.out.println("From inside of Begin03 class and demo5() method");
		System.out.println("\tParameter value of urlName is: "+urlName);
	}

}
