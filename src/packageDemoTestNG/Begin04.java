package packageDemoTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Begin04 {
	// All Logins
	//@Parameters({"url"})
	@Test(dataProvider="getTestData")
	public void webLoginCarLoan(String userName, String password) {
		System.out.println("From inside of Begin04 class, webLoginCarLoan() method:");
		//System.out.println("\tParameter value of urlName is: "+urlName);
		System.out.println("\t"+userName+"\n\t"+password);
		
	}

	@BeforeClass
	public void firstWithinClass(){
		System.out.println("From inside of Begin04 class, firstWithinClass() method:\nI get to go FIRST inside this CLASS");
	}
	
	@Test
	public void mobileLoginCarLoan() {
		System.out.println("From inside of Begin04 class, mobileLoginCarLoan() method");
	}

	@Test(timeOut=3000)
	public void apiLoginCarLoan() {
		System.out.println("From inside of Begin04 class, apiLoginCarLoan() method");
	}

	// All fresh Loan Applications
	@Test(enabled=false)
	public void webFreshCarLoan() {
		System.out.println("From inside of Begin04 class, webFreshCarLoan() method ");

	}

	@Test(groups= {"smoke"})
	public void mobileFreshCarLoan() {
		System.out.println("From inside of Begin04 class, mobileFreshCarLoan() method ");
	}
	
	@AfterClass
	public void lastWithinClass() {
		System.out.println("From inside of Begin04 class, lastWithinClass() method:\nI get to go LAST inside this CLASS");
	}

	@Test(dependsOnMethods="apiLoginCarLoan")
	public void apiFreshCarLoan() {
		System.out.println("From inside of Begin04 class, apiFreshCarLoan() method ");
	}

	@BeforeMethod
	public void beforeEveryMethod() {
		System.out.println(
				"From inside of Begin04 class, beforeEveryMethod() method:\nI will run EVERY TIME BEFORE EACH TEST CASE(METHOD) inside this CLASS runs");

	}
	
	@DataProvider
	public Object[][] getTestData() {
	Object[][] objectArrayObject = new Object[4][2]; //Instantiate and Array Object of type "Object" class - returns an OBJECT that is an ARRAY of OBJECTS!
	
	//Store the DATA VALUES of 4 DATA-SETS
	objectArrayObject[0][0] = "achuk"; //First Row (row index 0), First Column (column index 0) --> 1st userName value in DATA SET
	objectArrayObject[0][1] = "bye";//First Row (row index 0), Second Column (column index 1) --> 1st password value in DATA SET
	
	objectArrayObject[1][0] = "daan";
	objectArrayObject[1][1] = "paali";
	
	objectArrayObject[2][0] = "cheeku";
	objectArrayObject[2][1] = "meeku";
	
	objectArrayObject[3][0] = "adhika";
	objectArrayObject[3][1] = "prasanga";
	
	return objectArrayObject;
	
	}
}
