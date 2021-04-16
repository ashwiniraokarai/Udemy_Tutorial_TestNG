package packageDemoTestNG;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
//TestNG library import (for @AfterSuite annotation)
import org.testng.annotations.AfterTest;
//TestNG library import (for @AfterTest annotation)
import org.testng.annotations.BeforeTest;
//TestNG library import (for @BeforeTest annotation)
import org.testng.annotations.Parameters;
//TestNG library import (for @Parameters annotation)
import org.testng.annotations.Test;
//TestNG library import (for @Test annotation)

public class Begin01 extends Begin06_DataDrive_PropertiesFile{
	@AfterTest
	public void close() {
		System.out.println(
				"From inside Begin01 class, close() method:\nI was picked for running LAST, after all other methods");
	}
	
	@Parameters({"url"})
	@Test
	public void demo1(String urlName) {
		System.out.println("My first TestNG program:");
		System.out.println("\tParameter value of urlName is: "+urlName);
	}

	@AfterSuite
	public void end() throws IOException {
		//Treat the INHERITED login() method as though it were a LOCAL method
		//login();
		System.out.println(
				"From inside Begin01 class, end() methods:\nI get to go LAST, after all other methods in this test SUITE");
	}

	@Test(groups= {"smoke"})
	public void demo2() throws IOException {
		//Treat the INHERITED login() method as though it were a LOCAL method
		//login();
		System.out.println("Bye for now");
	}
	
}
