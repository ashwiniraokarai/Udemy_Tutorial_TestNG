package packageDemoTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Begin02 {
	@AfterMethod
	public void afterEveryMethod(){
		System.out.println(
				"From inside of Begin02 class, afterEveryMethod() method:\nI will run EVERY TIME AFTER EACH TEST CASE(METHOD) inside this CLASS runs");
	}
	
	@Parameters({"url"})
	@Test(groups= {"smoke"})
	public void demo3(String urlName) {
		System.out.println("From inside of Begin02 class, demo3 method");
		System.out.println("\tParameter value of urlName is: "+urlName);
	}
	
	@BeforeTest
	public void deleteHistoricDataEntries() {
		System.out.println("From inside Begin02 class:\nI am a preqresuite method and was chosen to RUN before all other TEST CASES (methods)");
	}

}
